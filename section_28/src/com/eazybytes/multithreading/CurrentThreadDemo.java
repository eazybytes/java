package com.eazybytes.multithreading;

public class CurrentThreadDemo {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.threadId());
        System.out.println(mainThread.getName());
    }

}
