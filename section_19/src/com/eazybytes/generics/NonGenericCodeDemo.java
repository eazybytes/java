package com.eazybytes.generics;

public class NonGenericCodeDemo {

    public static void main(String[] args) {
        Pair stringIntPair = new Pair("Hello", 42);
        stringIntPair.setFirst(16);
        String myString = (String) stringIntPair.getFirst(); // Requires casting
        int myInt = (Integer) stringIntPair.getSecond(); // Requires casting
        System.out.println(myString);
        System.out.println(myInt);
    }

}
