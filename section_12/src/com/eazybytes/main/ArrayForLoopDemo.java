package com.eazybytes.main;

public class ArrayForLoopDemo {

    public static void main(String[] args) {
        int[] mobileNumbers = new int[116];
        mobileNumbers[0] = 766554433;
        mobileNumbers[16] = 566554433;
        mobileNumbers[24] = 567554433;
        mobileNumbers[38] = 766573233;
        mobileNumbers[94] = 766738433;

        for (int i=0; i<mobileNumbers.length;i++) {
            System.out.println("The element at index : "+ i + " is : "+mobileNumbers[i]);
        }

        String[] names = new String[3];
        names[2] = "Madan";
        for (int i=0; i<names.length;i++) {
            System.out.println("The element at index : "+ i + " is : "+names[i]);
        }


    }

}
