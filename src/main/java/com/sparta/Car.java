package com.sparta;

public class Car {

    private int numberOfWheels = 4;
    private String colour = "red";

    private boolean catVarApproved = true;

    public boolean isCarVatApproved() {
        return catVarApproved;
    }

    public String honk() {
        return "honk";
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        //any code that calls neccessary additional methods goes here
        this.numberOfWheels = numberOfWheels;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String setColour) {
        // any prerequisites
        this.colour = setColour;
    }
}
