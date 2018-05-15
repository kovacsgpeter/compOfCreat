package com.codecool.lenyekVersenye;

import java.util.Random;

public enum Weather {
    SUNNY, CLOUDY, RAINY;

    static Weather instance = null;

    public static Weather getInstance() {
        return instance;
    }

    public static void dayChange() {
        instance = Weather.values()[new Random().nextInt(Weather.values().length)];
    }



}
