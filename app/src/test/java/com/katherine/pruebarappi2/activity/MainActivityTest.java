package com.katherine.pruebarappi2.activity;

import com.katherine.pruebarappi2.model.GeneralResponse;
import com.katherine.pruebarappi2.res.ApiClient;
import com.katherine.pruebarappi2.res.ApiServiceClientInterface;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void getThemes() {

        ApiServiceClientInterface apiService = ApiClient.getClient().create(ApiServiceClientInterface.class);

        Call<GeneralResponse> call = apiService.getThemes();

        try {
            Response<GeneralResponse> response = call.execute();
            assertTrue(response.isSuccessful());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}