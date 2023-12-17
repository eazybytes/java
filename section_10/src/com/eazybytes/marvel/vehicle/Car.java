package com.eazybytes.marvel.vehicle;

import com.eazybytes.marvel.base.Vehicle;

public class Car extends Vehicle {

    public int horsePower ;
    public String color ;
    public String turningRadius;
    public boolean isAutomatic;

    public Car() {
        super("Water");
        System.out.println("Inside Car default constructor");
        horsePower = 150;
        color = "Black";
        turningRadius = "6.23";
        isAutomatic = true;
    }

    public static void start() {
        System.out.println("Car starting...");
    }

    public void printCarDetails() {
        System.out.println(color);
        System.out.println(super.color);
    }

}
