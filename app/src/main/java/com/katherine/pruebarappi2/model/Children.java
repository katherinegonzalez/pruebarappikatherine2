package com.katherine.pruebarappi2.model;

import com.google.gson.annotations.SerializedName;

public class Children {

    @SerializedName("kind")
    private String kind;
    @SerializedName("data")
    private DataChildren data;

    public Children() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public DataChildren getData() {
        return data;
    }

    public void setData(DataChildren data) {
        this.data = data;
    }
}
