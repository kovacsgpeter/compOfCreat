package com.codecool.lenyekVersenye;

public class SandWalker extends Creature {


    public SandWalker(String name,  int currentWaterLevel) {
        super(name, currentWaterLevel);
        MAXWATERCAPACITY=8;
        checkWaterLevelMAx();

    }

    @Override
    void move() {
        switch (Weather.getInstance()) {
            case SUNNY:distanceTravelled+=3;break;
            case CLOUDY:distanceTravelled+=1;break;
        }


    }

    @Override
    void changeWater() {
        System.out.println("sandwalker wl: " + currentWaterLevel);
        switch (Weather.getInstance()) {

            case SUNNY:currentWaterLevel -=1 ;break;
            case RAINY:currentWaterLevel +=3 ;break;
        }
        checkWaterLevelMAx();


    }



}
