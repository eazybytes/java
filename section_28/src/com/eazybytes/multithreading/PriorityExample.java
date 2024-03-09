package com.eazybytes.multithreading;

public class PriorityExample implements Runnable {

    private final String name;

    public PriorityExample(String name) {
        this.name = name;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(name + " - Count: "+i+", Priority : " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
