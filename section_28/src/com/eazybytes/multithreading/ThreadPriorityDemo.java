package com.eazybytes.multithreading;

public class ThreadPriorityDemo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new PriorityExample("Thread A"));
        Thread thread2 = new Thread(new PriorityExample("Thread B"));
        Thread thread3 = new Thread(new PriorityExample("Thread C"));

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
