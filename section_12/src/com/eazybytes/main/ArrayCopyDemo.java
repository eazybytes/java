package com.eazybytes.main;

import java.util.Arrays;

public class ArrayCopyDemo {

    public static void main(String[] args) {

        int[] oldArray = {1,2,3,4,5};
        int[] newArray = new int[oldArray.length+5];
        // newArray = copyArrayUsingLoop(oldArray, newArray);
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        int[] targetArray = Arrays.copyOf(oldArray,3);
        int[] targetArray1 = Arrays.copyOfRange(oldArray,1, 3);

        for(int num:targetArray1) {
            System.out.println(num);
        }

    }

    private static int[] copyArrayUsingLoop(int[] oldArray, int[] newArray) {
            for(int i = 0; i<oldArray.length;i++){
                newArray[i] = oldArray[i];
            }
            return newArray;
    }
}
