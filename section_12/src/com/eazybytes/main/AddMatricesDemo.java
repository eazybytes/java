package com.eazybytes.main;

public class AddMatricesDemo {

    public static void main(String[] args) {

        int[][] array1 = {
                {4,7,9}, {5,7,0}
        };
        int[][] array2 = {
                {3,8,2}, {2,6,1}
        };

        int[][] sumArray = new int[2][3];

        for (int i = 0;i<array1.length;i++) {
            for (int j=0;j<array1[i].length;j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }

    }

}
