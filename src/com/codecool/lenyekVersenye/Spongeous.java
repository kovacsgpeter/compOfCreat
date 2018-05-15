package com.codecool.lenyekVersenye;

public class Spongeous extends Creature {



    public Spongeous(String name, int currentWaterLevel) {
        super(name,  currentWaterLevel);
        MAXWATERCAPACITY = 20;
        checkWaterLevelMAx();
    }

    @Override
    void move() {
        switch (Weather.getInstance()) {
            case RAINY:distanceTravelled+=3;break;
            case CLOUDY:distanceTravelled+=1;break;
        }


    }

    @Override
    void changeWater() {

        switch (Weather.getInstance()) {
            case SUNNY:currentWaterLevel-=4;break;
            case CLOUDY:currentWaterLevel-=1;break;
            case RAINY:currentWaterLevel+=6;break;
        }
        checkWaterLevelMAx();


    }


}
