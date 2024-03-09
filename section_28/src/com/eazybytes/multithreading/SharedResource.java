package com.eazybytes.multithreading;

public class SharedResource {

    private int data;
    private boolean isEmpty = true;

    // Producer method
    synchronized void produce(int value) {
        while (!isEmpty) {
            try {
                // Buffer is not empty, wait for the consumer to consume
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Produce an item
        data = value;
        isEmpty = false;
        System.out.println("Produced: " + value);

        // Notify the waiting consumer
        notify();
    }

    // Consumer method
    synchronized int consume() {
        while (isEmpty) {
            try {
                // Buffer is empty, wait for the producer to produce
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Consume the item
        int consumedData = data;
        isEmpty = true;
        System.out.println("Consumed: " + consumedData);

        // Notify the waiting producer
        notify();

        return consumedData;
    }


}
