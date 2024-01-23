package com.eazybytes.object.demo;

public class FinalizeDemo {

    public static void main(String[] args) {
        for(int i=0;i<1000000;i++) {
            System.out.println(i);
            new Person();
        }
    }

}
