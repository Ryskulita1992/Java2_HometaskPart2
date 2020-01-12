package com.company;

public class Dubai extends tours {
    private String dayOfDeparture;
    private String dayOfArrival;
    private int weather;

    private String getDayOfDeparture() {
        return dayOfDeparture;
    }

    private String getDayOfArrival() {
        return dayOfArrival;
    }

    private int getWeather() {
        return weather;
    }
    public Dubai (){};

    public Dubai (String dayOfDeparture, String dayOfArrival, int weather) {
        this.dayOfDeparture = dayOfDeparture;
        this.dayOfArrival = dayOfArrival;
        this.weather = weather;
    }
    public static void buyGifts ( int price){};
    public static void buyGifts  (String relatives){};
    public static void buyGifts  (char location){};






}
