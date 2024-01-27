package com.eazybytes.generics;

public class GenericCodeDemo {

    public static void main(String[] args) {
        GenericPair<String,Integer> stringIntPair = new GenericPair<>("Hello", 42);
        stringIntPair.setFirst("Another String");
        stringIntPair.setSecond(123);
        String myString =  stringIntPair.getFirst();
        int myInt =  stringIntPair.getSecond();
        System.out.println(myString);
        System.out.println(myInt);
    }

}
