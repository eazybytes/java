package com.eazybytes.object.demo;

public class MutableDemo {

    public static void main(String[] args) {
        MutablePerson mutablePerson = new MutablePerson("John", "Software Engineer");
        System.out.println(mutablePerson.getOccupation());
        mutablePerson.setOccupation("Doctor");
        System.out.println(mutablePerson.getOccupation());
    }

}
