package com.sparta;

public class FordFiesta extends Car{
    // override method

    @Override
    public String honk() {
        System.out.println("Fiesta specific quiet, pathetic horn");
        return "Fiesta specific quiet, pathetic horn";
    }
}
