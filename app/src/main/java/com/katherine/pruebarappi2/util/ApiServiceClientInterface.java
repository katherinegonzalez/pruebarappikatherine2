package com.katherine.pruebarappi2.util;

import com.katherine.pruebarappi2.model.GeneralResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServiceClientInterface {

    @GET("reddits.json")
    Call<GeneralResponse> getThemes();

}
