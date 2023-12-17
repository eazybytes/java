package com.eazybytes.marvel.app;

import com.eazybytes.marvel.animals.Cat;
import com.eazybytes.marvel.animals.Dog;
import com.eazybytes.marvel.base.Animal;

public class AnimalUtility {

    public static void printName(Animal animal) {
        System.out.println(animal.getName());
        animal.eat();
    }

    public static void performAction(Animal animal) {
        animal.eat();
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal instanceof Cat cat) { // Java 16
            cat.meow();
        }

    }

}
