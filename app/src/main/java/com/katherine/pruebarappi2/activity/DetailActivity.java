package com.katherine.pruebarappi2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.katherine.pruebarappi2.R;
import com.katherine.pruebarappi2.util.Util;
import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailActivity extends AppCompatActivity {

    private TextView txtDescription, txtTitle, txtOver18, txtSuscribers, txtAudienceTarget, txtDate;
    private ImageView imgHeader;
    private LinearLayout imgBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtDescription = findViewById(R.id.txt_description);
        txtTitle = findViewById(R.id.txt_title);
        txtOver18 = findViewById(R.id.txt_over_18);
        txtSuscribers = findViewById(R.id.txt_suscribers);
        txtAudienceTarget = findViewById(R.id.txt_audience_target);
        txtDate = findViewById(R.id.txt_date);
        imgHeader = findViewById(R.id.img_header);
        imgBanner = findViewById(R.id.img_banner);

        setData();
    }

    public void setData(){
        if(Util.dataChildrenDetail != null){
            txtDescription.setText(Util.dataChildrenDetail.getDescription());
            txtTitle.setText(Util.dataChildrenDetail.getHeaderTitle());
            txtOver18.setText(Util.dataChildrenDetail.getOver18() ? "Si" : "No");
            txtSuscribers.setText(Util.dataChildrenDetail.getSubscribers().toString());
            txtAudienceTarget.setText(Util.dataChildrenDetail.getAudienceTarget());

            if(Util.dataChildrenDetail.getCreated() != null){

                Date date = new Date(Util.dataChildrenDetail.getCreated());
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String dateFormat = formatter.format(date);

               txtDate.setText(dateFormat.toString());
            }else{
                txtDate.setText("");
            }
            if(Util.dataChildrenDetail.getHeaderImg() != null){
                if(!Util.dataChildrenDetail.getHeaderImg().equals("")){
                    Picasso.with(this).load(Util.dataChildrenDetail.getHeaderImg()).into(imgHeader);
                }
            }

            if(Util.dataChildrenDetail.getBannerImg() != null) {
                if(!Util.dataChildrenDetail.getBannerImg().equals("")){
                    // Loading profile image
                    final ImageView img = new ImageView(this);
                    Picasso.with(img.getContext())
                            .load(Util.dataChildrenDetail.getBannerImg())
                            .into(img, new com.squareup.picasso.Callback() {
                                @Override
                                public void onSuccess() {
                                    System.out.println("cargó imagen de perfil");
                                    imgBanner.setBackgroundDrawable(img.getDrawable());
                                }

                                @Override
                                public void onError() {
                                    System.out.println("Error al cargar imagen de perfil");
                                }
                            });
                }

            }

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(Util.pDialog != null){
            Util.pDialog.dismiss();
        }
    }
}
