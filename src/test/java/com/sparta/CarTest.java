package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    @DisplayName("Testing get colour of car")
    public void testingGetColourOfCar() {
        Car fordFiesta = new FordFiesta();
        Assertions.assertEquals("red", fordFiesta.getColour());
    }

    @Test
    @DisplayName("Testing get number of wheels")
    public void testingGetNumberOfWheels() {
        Car fordFocus = new FordFocus();
        Assertions.assertEquals(4, fordFocus.getNumberOfWheels());
    }

    @Test
    @DisplayName("Testing if it has VAT")
    public void testingHasVAT() {
        Car fordFiesta = new FordFiesta();
        Assertions.assertTrue(fordFiesta.isCarVatApproved());
    }

    @Test
    @DisplayName("Testing car setters")
    public void testingCarSettors(){
        Car fordFiesta = new FordFiesta();
        fordFiesta.setColour("blue");
        fordFiesta.setNumberOfWheels(3);
        Assertions.assertEquals("blue", fordFiesta.getColour());
        Assertions.assertEquals(3, fordFiesta.getNumberOfWheels());
    }

    @Test
    @DisplayName("checking the honks for cars are different")
    public void checkHonksForCars() {
        Car fordFiesta = new FordFiesta();
        Car fordFocus = new FordFocus();
        Assertions.assertNotEquals(fordFocus.honk(), fordFiesta.honk());
    }
}