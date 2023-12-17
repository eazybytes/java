package com.eazybytes.marvel.base;

public class Person {

    protected  String name;
    protected  int age;
    public static int noOfHands = 2;

     protected void calculateAge(int year) {
        System.out.println("Age method");
    }

    public void eat(String food) {
        System.out.println("Person is eating the food : " + food);
    }

    public void walk () {
        System.out.println("Person is walking");
    }

    public void sleep () {
        System.out.println("Person is sleeping");
    }

}
