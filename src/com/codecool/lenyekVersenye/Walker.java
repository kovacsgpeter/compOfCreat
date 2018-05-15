package com.codecool.lenyekVersenye;

public class Walker extends Creature {


    public Walker(String name, int currentWaterLevel) {
        super(name, currentWaterLevel);
        MAXWATERCAPACITY = 12;
        checkWaterLevelMAx();
    }

    @Override
    void move() {
        switch (Weather.getInstance()) {
            case SUNNY:distanceTravelled+=1;break;
            case CLOUDY:distanceTravelled+=2;break;
            case RAINY:distanceTravelled+=1;break;
        }


    }

    @Override
    void changeWater() {

        switch (Weather.getInstance()) {
            case SUNNY:currentWaterLevel-=2;break;
            case CLOUDY:currentWaterLevel-=1;break;
            case RAINY:currentWaterLevel+=3;break;
        }
        checkWaterLevelMAx();


    }


}
