package com.katherine.pruebarappi2.model;

import com.google.gson.annotations.SerializedName;

public class GeneralResponse {

    @SerializedName("kind")
    private String kind;
    @SerializedName("data")
    private String data;

    public GeneralResponse() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
