package com.eazybytes.main;

public class ArrayForEachLoopDemo {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for(int num : numbers) {
            System.out.println(num);
        }

        String[] names = {"Madan", "John", "Lucy"};



        for(int i=0;i<names.length;i++) {
            names[i] = names[i].toUpperCase();
        }

    }

}
