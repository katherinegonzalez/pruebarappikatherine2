package com.katherine.pruebarappi2.activity;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.katherine.pruebarappi2.R;
import com.katherine.pruebarappi2.util.DateFormat;
import com.katherine.pruebarappi2.util.Util;
import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailActivity extends AppCompatActivity {

    private TextView txtDescription, txtTitle, txtOver18, txtSuscribers, txtAudienceTarget, txtDate;
    private ImageView imgHeader;
    private LinearLayout imgBanner;
    private ActionBar actionBar;
    private String title = "Theme";
    private String titleDescription = "About this theme";
    private String imgTop = "";
    private String imgBottom = "";
    private DateFormat dateFormat = new DateFormat();

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
        actiobBar();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        this.finish();
        return true;

    }

    public void actiobBar(){
        actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(Util.appTitle);
        actionBar.setSubtitle(title);
    }

    public String img(String image){
        String img = "";
        if(image != null) {
            if (!image.equals("")) {
                img = image;
            }
        }

        return img;
    }



    public void validationImageTop(){
        if(!img(Util.dataChildrenDetail.getBannerImg()).equals("")){
            imgTop = img(Util.dataChildrenDetail.getBannerImg());
        }else{
            if(!img(Util.dataChildrenDetail.getHeaderImg()).equals("")){
                imgTop =img(Util.dataChildrenDetail.getHeaderImg());
            }else{
                if(!img(Util.dataChildrenDetail.getIconImg()).equals("")){
                    imgTop =  img(Util.dataChildrenDetail.getIconImg());
                }
            }
        }
    }

    public void validationImageBottom(){

            if(!img(Util.dataChildrenDetail.getHeaderImg()).equals("")){
                imgBottom = img(Util.dataChildrenDetail.getHeaderImg());
            }else{
                if(!img(Util.dataChildrenDetail.getIconImg()).equals("")){
                    imgBottom =img(Util.dataChildrenDetail.getIconImg());
                }else{
                    if(!Util.dataChildrenDetail.getBannerImg().equals("")){
                        imgTop =  Util.dataChildrenDetail.getBannerImg();
                    }
                }
            }

    }

    public String headerTitle(String title){
        String headerTitle = "";
        if(title != null){
            if(!title.equals("")){
                headerTitle = title;
            }
        }
        return "";
    }

    public String subtitle(String subt){
        String subtitle = "";
        if(subt != null){
            if(!subt.equals("")){
                subtitle = subt;
            }
        }
        return subtitle;
    }

    public void validationSubtitleAndDescription(){

        if(!subtitle(Util.dataChildrenDetail.getHeaderTitle()).equals("")){
            title = subtitle(Util.dataChildrenDetail.getHeaderTitle());
            titleDescription = "About " + title;
        }else{
            if(!subtitle(Util.dataChildrenDetail.getTitle()).equals("")){
                title = subtitle(Util.dataChildrenDetail.getTitle());
            }
        }

    }


    public void setData(){
        if(Util.dataChildrenDetail != null){

            validationImageBottom();
            validationImageTop();
            validationSubtitleAndDescription();
            txtTitle.setText(titleDescription);

            Spanned sp;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                sp = Html.fromHtml("<![CDATA["+Util.dataChildrenDetail.getDescriptionHtml()+"...]]>",Html.FROM_HTML_MODE_LEGACY);

            } else {
                sp = Html.fromHtml("<![CDATA["+Util.dataChildrenDetail.getDescriptionHtml()+"...]]>");

            }
            txtDescription.setText(sp);

            txtOver18.setText(Util.dataChildrenDetail.getOver18() ? "Si" : "No");
            txtSuscribers.setText(Util.dataChildrenDetail.getSubscribers().toString());
            txtAudienceTarget.setText(Util.dataChildrenDetail.getAudienceTarget());

            txtDate.setText(dateFormat.dateFormat(Util.dataChildrenDetail.getCreated()));

            if(!imgBottom.equals("")){
                Picasso.with(this).load(Util.dataChildrenDetail.getHeaderImg()).into(imgHeader);
            }

            if(!imgTop.equals("")){
                final ImageView img = new ImageView(this);
                Picasso.with(img.getContext())
                        .load(imgTop)
                        .into(img, new com.squareup.picasso.Callback() {
                            @Override
                            public void onSuccess() {
                                imgBanner.setBackgroundDrawable(img.getDrawable());
                            }
                            @Override
                            public void onError() {
                                Toast.makeText(DetailActivity.this,"It's not possible to show the image now!", Toast.LENGTH_SHORT).show();
                            }
                        });
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
