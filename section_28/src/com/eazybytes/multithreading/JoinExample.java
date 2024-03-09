package com.eazybytes.multithreading;

public class JoinExample {

    public static void main(String[] args) {
        Thread threadA = new Thread(
                () -> {
                    for(int i=1;i<=5;i++) {
                        System.out.println("Thread A - count : "+i);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        threadA.start();
        try {
            threadA.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread ended");
    }

}
