package com.katherine.pruebarappi2.util;

public class ValidateString {

    public ValidateString() {
    }

    public String str(String value){
        String str = "";
        if(value != null) {
            if (!value.equals("")) {
                str = value;
            }
        }
        return str;
    }
}
