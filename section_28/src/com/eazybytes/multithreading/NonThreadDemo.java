package com.eazybytes.multithreading;

public class NonThreadDemo {

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            System.out.println(i);
        }

        for (int i=100;i<201;i++){
            System.out.println(i);
        }
    }

}
