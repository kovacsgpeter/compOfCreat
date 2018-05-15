package com.codecool.lenyekVersenye;

public abstract class Creature {
    String name;
    int distanceTravelled;
    Boolean isAlive;
    int MAXWATERCAPACITY;
    int currentWaterLevel;

    public Creature(String name, int currentWaterLevel) {
        this.name = name;
        this.currentWaterLevel = currentWaterLevel;
        System.out.println(this.currentWaterLevel);
        //
        isAlive = true;

    }

    public  String getName() {
        return name;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getCurrentWaterLevel() {
        return currentWaterLevel;
    }

    void live() {
        if (isAlive) {
            changeWater();
            die();
            move();
        }

    }

    abstract void move();
    abstract void changeWater();

    public void die() {

        if (currentWaterLevel < 1) {
            System.out.println("most ne fuss");
            currentWaterLevel=0;
            isAlive = false;
        }
    }

    void checkWaterLevelMAx(){
        if (currentWaterLevel>MAXWATERCAPACITY) {
            currentWaterLevel=MAXWATERCAPACITY;
        }
    }
}
