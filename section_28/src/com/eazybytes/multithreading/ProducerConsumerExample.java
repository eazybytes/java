package com.eazybytes.multithreading;

public class ProducerConsumerExample {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(
                () -> {
                    for(int i = 1; i<=10; i++){
                        sharedResource.produce(i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        producerThread.start();

        Thread consumerThread = new Thread(
                () -> {
                    for(int i = 1; i<=10; i++){
                        sharedResource.consume();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        consumerThread.start();
    }

}
