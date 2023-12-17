package com.eazybytes.marvel.app;

import com.eazybytes.marvel.base.Person;
import com.eazybytes.marvel.heros.IronMan;

public class DynamicPoly {

    public static void main(String[] args) {
        Person person = new IronMan(); // upcasting
        person.walk(); // IronMan walk method is going to be invoked
        person.eat("Ice Cream");

        IronMan ironMan = new IronMan();
        ironMan.callOverriddenEatMethod();

    }

}
