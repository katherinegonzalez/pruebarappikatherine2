package com.katherine.pruebarappi2.util;

public class Messages {
    private static final Messages ourInstance = new Messages();

    public static Messages getInstance() {
        return ourInstance;
    }

    private Messages() {
    }

    public String errorDetail(){
        return "It is not possible to show the theme detail right now. Please try later!";
    }

    public String errorImage(){
        return "It's not possible to show the image now!";
    }

    public String errorInternet(){
        return "Please check your Internet conection!";
    }

    public String noThemesByFailConection(){
        return "At this moment there is no themes to show. Please try again when you have Internet conection.";
    }

    public String noThemes(){
        return "It is not possible to show themes right now. Please try later!";
    }

    public String serverError(){
        return "Server error! Please try again.";
    }


}
