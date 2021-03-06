package com.katherine.pruebarappi2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.widget.Toast;

import com.katherine.pruebarappi2.R;
import com.katherine.pruebarappi2.adapter.AdapterThemes;
import com.katherine.pruebarappi2.model.Children;
import com.katherine.pruebarappi2.model.GeneralResponse;
import com.katherine.pruebarappi2.res.ApiClient;
import com.katherine.pruebarappi2.res.ApiServiceClientInterface;
import com.katherine.pruebarappi2.storage.SaveInCache;
import com.katherine.pruebarappi2.util.ConvertGson;
import com.katherine.pruebarappi2.util.Dialogs;
import com.katherine.pruebarappi2.util.Messages;
import com.katherine.pruebarappi2.util.NetValidation;
import com.katherine.pruebarappi2.util.Util;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    private RecyclerView themeList;
    private List<Children> itemsThemes = new ArrayList<>();
    private AdapterThemes adapterThemes;
    private TextView searchFilter, txtThereIsNoItems;
    private NetValidation netValidation = new NetValidation();
    private SaveInCache saveInCache = new SaveInCache();
    private ConvertGson convertGson = new ConvertGson();
    private Dialogs dialogs = new Dialogs();
    private String filename = "themes";
    private String searchFilterText = "";
    private Messages messages = Messages.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            //Recupero la instancia en caso de que la haya (para rotación de pantalla o cuando regreso del detalle)
            searchFilterText = savedInstanceState.getString("search_filer");
        }

        themeList = findViewById(R.id.list_themes);
        LinearLayoutManager lim = new LinearLayoutManager(this);
        lim.setOrientation(LinearLayoutManager.VERTICAL);
        themeList.setLayoutManager(lim);

        searchFilter = findViewById(R.id.search_filter);
        searchFilter.setImeOptions(EditorInfo.IME_FLAG_NO_EXTRACT_UI);
        searchFilter.addTextChangedListener(this);

        txtThereIsNoItems = findViewById(R.id.txt_there_is_no_items);

        netValidation();


    }

    public void validateSearchText(){

        if(!searchFilterText.equals("")){
            initializeListFilter(searchFilterText.toString());
        }else{
            themeList.setAdapter(adapterThemes);
        }

    }

    public void netValidation(){
        if(netValidation.isNet(MainActivity.this)){ //Si hay internet
            getThemes();
        }else{
            if(!saveInCache.getDataInCache(this, filename).isEmpty()){ //Si no hay internet reviso los datos que hay en cahche
                txtThereIsNoItems.setVisibility(View.GONE);
                GeneralResponse generalResponse = convertGson.deserializingGson(saveInCache.getDataInCache(this, filename));
                itemsThemes = generalResponse.getData().getChildren();
                initializeListThemeAdapter();
            }else{
                txtThereIsNoItems.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, messages.noThemesByFailConection(), Toast.LENGTH_LONG).show();
                itemsThemes = new ArrayList<>();
                initializeListThemeAdapter();

            }
        }
    }

    public void initializeListThemeAdapter(){
        adapterThemes = new AdapterThemes(this, itemsThemes, filename);
        validateSearchText(); //Si el filtro contiene búsqueda actualizo la lista con esa búsqueda, de lo contrario pongo la lista completa

        if(Util.pDialog != null)
            Util.pDialog.dismiss();

    }

    public void initializeListFilter(String searchText){
        if(adapterThemes != null){
            adapterThemes.getFilter().filter(searchText);
            //Actualizar recyvler view
            adapterThemes.notifyDataSetChanged();
            themeList.setAdapter(adapterThemes);
        }
    }

    public void saveData(GeneralResponse generalResponse, String filename){
        String jsonMovieList = convertGson.serializingGson(generalResponse);
        saveInCache.saveInCache(this, filename, jsonMovieList);
    }

    public void getThemes(){

        dialogs.definirProgressDialog(this);
        Util.pDialog.show();

        ApiServiceClientInterface apiService = ApiClient.getClient().create(ApiServiceClientInterface.class);

        Call<GeneralResponse> call = apiService.getThemes();
        call.enqueue(new Callback<GeneralResponse>() {

            @Override
            public void onResponse(Call<GeneralResponse> call, final Response<GeneralResponse> response) {

                if(response.isSuccessful()){
                    if(!response.body().getData().getChildren().isEmpty()){

                        saveData(response.body(), filename); //Guardar datos en chaché

                        itemsThemes = response.body().getData().getChildren();
                        initializeListThemeAdapter();

                    }else{
                        if(Util.pDialog != null)
                            Util.pDialog.dismiss();
                        txtThereIsNoItems.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, messages.noThemes(), Toast.LENGTH_LONG).show();
                    }

                }else{
                    if(Util.pDialog != null)
                        Util.pDialog.dismiss();

                    String error = messages.serverError();
                    try {
                        JSONObject jObjError = new JSONObject(response.errorBody().string());
                        Log.d("Error: ", jObjError +"");
                        error= jObjError.get("errors").toString();
                        Log.d("Error: ", error);
                    } catch (Exception e) {
                        Log.d("Exception: ", e +"");
                    }

                    Toast.makeText(MainActivity.this, error, Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<GeneralResponse> call, Throwable t) {
                if(Util.pDialog != null)
                    Util.pDialog.dismiss();
                Toast.makeText(MainActivity.this, messages.errorInternet(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        initializeListFilter(charSequence.toString());
    }

    @Override
    public void afterTextChanged(Editable editable) {



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(Util.pDialog != null)
            Util.pDialog.dismiss();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(searchFilter.getText() != null){
            //Guardo la instancia para cuando haya rotación de pantalla o presion el botón "atras" del detalle
            outState.putString("search_filer", searchFilter.getText().toString());
        }

    }
}
