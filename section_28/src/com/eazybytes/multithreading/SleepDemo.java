package com.eazybytes.multithreading;

public class SleepDemo {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        for(int i=0;i<5;i++){
            System.out.println("Hello from Main method : " + i);
            Thread.sleep(1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken : " + (endTime-startTime));
    }

}
