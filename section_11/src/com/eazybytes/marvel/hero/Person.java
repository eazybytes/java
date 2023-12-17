package com.eazybytes.marvel.hero;

public interface Person {

     static void main(String[] args) {
         System.out.println("Hello World from Interfaces");
    }

    default void walk() {
        System.out.println("Walking");
    }

}
