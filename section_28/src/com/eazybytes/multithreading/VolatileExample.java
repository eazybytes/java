package com.eazybytes.multithreading;

public class VolatileExample {

    public static void main(String[] args) throws InterruptedException {
        SharedBooleanResource sharedBooleanResource = new SharedBooleanResource();
        Thread workerThread = new Thread(() -> sharedBooleanResource.doWork());

        Thread stopperThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
                sharedBooleanResource.setStopFlag();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }) ;
        workerThread.start();
        stopperThread.start();
        workerThread.join();
        stopperThread.join();
    }

}
