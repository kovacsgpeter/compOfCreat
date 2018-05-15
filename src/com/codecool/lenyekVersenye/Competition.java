package com.codecool.lenyekVersenye;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Competition {
    List<Creature> creatures;

    private void init(){
        creatures = new ArrayList<>();
        Creature bela = new SandWalker("bela",  7);
        Creature jani = new Spongeous("jani",  15);
        Creature Chuck = new Walker("Chuck",  11);
        creatures.add(bela);
        creatures.add(jani);
        creatures.add(Chuck);
    }

    public void Day(int daynumber) {
        for (int i = 0; i<daynumber; i++) {
            Weather.dayChange();
            System.out.println(Weather.getInstance());
            for (Creature cr: creatures) {
                cr.live();
                printStat(cr);
            }
        }
    }

    private void printStat(Creature cr) {
        System.out.println("name: " + cr.getName() + ", distnce: " + cr.getDistanceTravelled() +
        ", water level: " + cr.getCurrentWaterLevel());
    }

    public static void main(String[] args) {
        Competition first= new Competition();
        first.init();
        first.Day(9);


    }
}
