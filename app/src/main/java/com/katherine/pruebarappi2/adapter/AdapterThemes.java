package com.katherine.pruebarappi2.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.katherine.pruebarappi2.R;
import com.katherine.pruebarappi2.activity.DetailActivity;
import com.katherine.pruebarappi2.model.Children;
import com.katherine.pruebarappi2.model.DataChildren;
import com.katherine.pruebarappi2.storage.SaveInCache;
import com.katherine.pruebarappi2.util.CircleTransform;
import com.katherine.pruebarappi2.util.ConvertGson;
import com.katherine.pruebarappi2.util.Dialogs;
import com.katherine.pruebarappi2.util.Util;

import java.util.ArrayList;
import java.util.List;

public class AdapterThemes extends RecyclerView.Adapter<AdapterThemes.AdapterThemeViewHolder> implements Filterable {

    private Activity activity;
    private List<Children> itemsThemes;
    private List<Children> itemsThemesFiltered;
    private String filename;
    private SaveInCache saveInCache = new SaveInCache();
    private ConvertGson convertGson = new ConvertGson();
    private Dialogs dialogs = new Dialogs();

    public AdapterThemes(Activity activity, List<Children> itemsThemes, String filename) {
        this.activity = activity;
        this.itemsThemes = itemsThemes;
        this.itemsThemesFiltered = itemsThemes;
        this.filename = filename;
    }

    @Override
    public AdapterThemeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new AdapterThemeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdapterThemeViewHolder holder, int position) {
        final Children theme = itemsThemesFiltered.get(position);

        holder.txtTitle.setText(theme.getData().getHeaderTitle());
        holder.txtDescripction.setText(theme.getData().getPublicDescription());

        if(theme.getData().getIconImg() != null){
            if(!theme.getData().getIconImg().equals("")){

                Glide.with(holder.imageTheme.getContext()).load(theme.getData().getIconImg())
                        .crossFade()
                        .thumbnail(0.5f)
                        .bitmapTransform(new CircleTransform(holder.imageTheme.getContext()))
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(holder.imageTheme);

            }
        }

        holder.layoutTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialogs.definirProgressDialog(activity);
                Util.pDialog.show();

                String themeId = theme.getData().getId();
                    if(!saveInCache.getDataInCache(activity, filename).isEmpty()){ //busco en el caché los datos de cada item
                        Util.dataChildrenDetail = new DataChildren();
                        Util.dataChildrenDetail = convertGson.getDetailFromDesearilizingGson( themeId, saveInCache.getDataInCache(activity, filename));
                        if(Util.dataChildrenDetail != null){
                            Intent myIntent = new Intent(activity, DetailActivity.class);
                            activity.startActivity(myIntent);
                        }else{
                            Toast.makeText(activity, "It is not possible to show the theme detail right now. Please try later!", Toast.LENGTH_LONG).show();
                        }

                    }else{
                        Toast.makeText(activity, "It is not possible to show the theme detail right now. Please try later!", Toast.LENGTH_LONG).show();

                    }
            }
        });
    }

    @Override
    public int getItemCount() {
        if(itemsThemesFiltered != null){
            return itemsThemesFiltered.size();
        }

        return 0;
    }

    @Override
    public Filter getFilter() { //Para el filtro
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    itemsThemesFiltered = itemsThemes;
                } else {
                    List<Children> filteredList = new ArrayList<>();
                    for (Children row : itemsThemes) {

                        if (row.getData().getHeaderTitle().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }

                    itemsThemesFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = itemsThemesFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                itemsThemesFiltered = (ArrayList<Children>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public class AdapterThemeViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageTheme;
        private LinearLayout layoutTheme;
        private TextView txtTitle;
        private TextView txtDescripction;


        public AdapterThemeViewHolder(View itemView) {
            super(itemView);

            imageTheme = itemView.findViewById(R.id.img_icon);
            layoutTheme = itemView.findViewById(R.id.lyt_item);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtDescripction =  itemView.findViewById(R.id.txt_public_description);
        }
    }



}
