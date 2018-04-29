package com.katherine.pruebarappi2.util;

import com.google.gson.Gson;
import com.katherine.pruebarappi2.model.DataChildren;
import com.katherine.pruebarappi2.model.GeneralResponse;

public class ConvertGson {

    public ConvertGson() {
    }

    public String serializingGson(GeneralResponse generalResponse){
        Gson gson = new Gson();
        String json = gson.toJson(generalResponse);
        System.out.println(json);

        return json.toString();
    }

    public GeneralResponse deserializingGson(String json){

        GeneralResponse generalResponse = new Gson().fromJson(json, GeneralResponse.class);

        return generalResponse;
    }

    public DataChildren getDetailFromDesearilizingGson(String themeId, String json){
        GeneralResponse generalResponse = deserializingGson(json);
        if(generalResponse != null){
            if(!generalResponse.getData().getChildren().isEmpty()){
                for(int i=0; i<generalResponse.getData().getChildren().size(); i++){
                  if(generalResponse.getData().getChildren().get(i).getData().getId().equals(themeId)){
                      return generalResponse.getData().getChildren().get(i).getData();
                  }
                }
            }
        }
        return null;
    }
}
