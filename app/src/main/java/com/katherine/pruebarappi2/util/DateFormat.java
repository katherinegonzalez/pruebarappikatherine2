package com.katherine.pruebarappi2.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public DateFormat() {
    }

    public String dateFormat(Long dateLong){
        String dateFormat = "";
        try{
            if(dateLong != null){
                Date date = new Date(dateLong);
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                dateFormat = formatter.format(date);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return dateFormat;
    }
}
