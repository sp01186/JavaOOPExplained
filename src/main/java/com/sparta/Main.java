package com.sparta;

public class Main {

    public static void main(String[] args) {
        Car redCar = new Car();

//        redCar.honk();
//
//        System.out.println(redCar.colour);
        Car redFiesta = new FordFiesta();
        Car redFocus = new FordFocus();

        Car[] carArray = {redFiesta, redFocus, redCar};

//        for (Car c : carArray) { // for each loop
//            c.honk();
//        }

        System.out.println(redCar.getColour());
        redCar.setColour("pink");
        System.out.println(redCar.getColour());
    }
}