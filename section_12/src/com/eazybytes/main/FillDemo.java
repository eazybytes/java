package com.eazybytes.main;

import java.util.Arrays;

public class FillDemo {

    public static void main(String[] args) {

        int[] scores = new int[10];
        Arrays.fill(scores, 100);
        System.out.println(Arrays.toString(scores));

        int[] indices = new int[5];
        Arrays.setAll(indices, i -> i*2);
        System.out.println(Arrays.toString(indices));
        
    }

}
