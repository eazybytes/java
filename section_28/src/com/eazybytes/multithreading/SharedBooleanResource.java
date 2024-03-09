package com.eazybytes.multithreading;

public class SharedBooleanResource {

    private volatile boolean stopFlag = false;

    public void setStopFlag () {
        stopFlag = true;
    }

    public void doWork () {
        while(!stopFlag){
            System.out.println("Working...");
        }
        System.out.println("Work stopped");
    }
}
