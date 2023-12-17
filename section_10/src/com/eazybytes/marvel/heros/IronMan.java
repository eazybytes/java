package com.eazybytes.marvel.heros;

import com.eazybytes.marvel.base.Person;

public class IronMan extends Person {

    public void usePower() {
        System.out.println("IronMan is using his power");
    }

    @Override
    public void walk() {
        System.out.println("Ironman walking with his suite");
    }

    @Override
    public void eat(String food) {
        super.eat("Pasta");
        System.out.println("IronMan is eating the food : " + food);
    }
   // eat, String
    // eat,
    // eat, String, int
    // eat, int, String
    private void eat () {
        System.out.println("Method overloading 1");
    }

    public void eat (String food, int quantity) {
        System.out.println("Method overloading 2");
    }

    public void eat (int quantity, String food) {
        System.out.println("Method overloading 2");
    }

    public void callOverriddenEatMethod() {
        super.eat("Pasta");
    }

}
