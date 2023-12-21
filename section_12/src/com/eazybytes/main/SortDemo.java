package com.eazybytes.main;

import java.util.Arrays;
import java.util.Random;

public class SortDemo {

    public static void main(String[] args) {
        int[] smallArray = {5, 2,8,1,6};
        Arrays.sort(smallArray);
        System.out.println(Arrays.toString(smallArray));

        int[] largerArray = new int[10000];
        Random random = new Random();

        for(int i=0;i<largerArray.length;i++){
            largerArray[i] = random.nextInt(1000000);
        }
        Arrays.parallelSort(largerArray);
        System.out.println(Arrays.toString(largerArray));
    }

}
