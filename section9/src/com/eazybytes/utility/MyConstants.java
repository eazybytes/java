package com.eazybytes.utility;

public class MyConstants {

    public static final double TAX_RATE = 0.07;
    public static final double SHIPPING_COST = 5.95;

    public static double calculateTotalCost(double price) {
        return price + (price * TAX_RATE) + SHIPPING_COST;
    }

}
