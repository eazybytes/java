package com.eazybytes.multithreading;

public class HelloThread1 implements Runnable {

    @Override
    public void run () {
        System.out.println("Hello from HelloThread1 class " +
                " which implements Runnable");
    }

}
