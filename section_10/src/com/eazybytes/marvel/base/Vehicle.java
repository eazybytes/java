package com.eazybytes.marvel.base;

public class Vehicle {

    Engine engine;
    public int horsePower;
    public String color;
    public double turningRadius;
    public String madeFor;

    public Vehicle(String madeFor) {
        System.out.println("Inside Vehicle default constructor");
        horsePower = 120;
        color = "White";
        turningRadius = 5.23;
        this.madeFor = madeFor;
    }

    public static void start() {
        System.out.println("Vehicle starting...");
    }

}
