package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    @DisplayName("Testing get colour of car")
    public void getColourOfCar() {
        Car fordFiesta = new FordFiesta();
        Assertions.assertEquals("red", fordFiesta.getColour());
    }
}