package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeTest {

    @Test
    public void ShouldReturnCoffeeGetters(){
        Coffee myCoffe = new Coffee("BGL0", 0.49, "Bagel", "Onion");

        Assertions.assertEquals("BGL0", myCoffe.getSku());
        Assertions.assertEquals(0.49, myCoffe.getPrice());
        Assertions.assertEquals("Bagel", myCoffe.getName());
        Assertions.assertEquals("Onion", myCoffe.getVariant());

    }





}
