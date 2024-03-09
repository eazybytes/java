package com.eazybytes.multithreading;

import java.util.Random;

public class VirtualThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        Runnable runnable = () -> {
           double result = random.nextDouble(1000) * random.nextDouble(1000);
            System.out.println(result);
        };
        for (int i =0; i<500000; i++) {
                 Thread.ofVirtual().start(runnable).join(); //8828
                 // Thread.startVirtualThread(runnable).join(); // 8844
                // Thread thread = new Thread(runnable); // 30563
                // thread.start();
                // thread.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time : " + (endTime-startTime));
    }

}
