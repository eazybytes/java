package com.eazybytes.multithreading;

public class ThreadIDNameDemo {

    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        t3.setName("MyThread");

        System.out.println("Thread 1 ID is : " + t1.getId() + ", name : "+ t1.getName());
        System.out.println("Thread 2 ID is : " + t2.threadId() + ", name : "+ t2.getName());
        System.out.println("Thread 3 ID is : " + t3.threadId() + ", name : "+ t3.getName());
    }

}
