package com.eazybytes.object.demo;

public class GetClassDemo {

    public static void main(String[] args) {
        Person person = new Person();
        Class prsnClass = person.getClass();
        System.out.println(prsnClass.getName());
        System.out.println(prsnClass.getSimpleName());
        System.out.println(prsnClass.getPackageName());
    }

}
