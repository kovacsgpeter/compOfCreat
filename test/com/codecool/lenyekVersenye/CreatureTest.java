package com.codecool.lenyekVersenye;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatureTest {

    @Test
    public void testMaxWater() {

       Creature testt = new SandWalker("testbela", 9);
       assertEquals(8, testt.currentWaterLevel);
    }

}