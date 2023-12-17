package com.eazybytes.marvel.app;

import com.eazybytes.marvel.animals.Cat;
import com.eazybytes.marvel.animals.Dog;
import com.eazybytes.marvel.base.Animal;

public class UpcastingDemo {

    public static void main(String[] args) {
        Animal anm = new Animal();
        anm.setName("Scooby");
        AnimalUtility.printName(anm);

        anm = new Dog();
        anm.setName("Charlie");
        AnimalUtility.printName(anm);

        Cat cat = new Cat();
        cat.setName("Snoopy");
        AnimalUtility.printName(cat);

    }
}
