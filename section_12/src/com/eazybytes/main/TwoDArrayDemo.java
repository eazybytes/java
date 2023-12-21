package com.eazybytes.main;

import java.util.Arrays;

public class TwoDArrayDemo {

    public static void main(String[] args) {
        int totalStudents = 3;
        int totalSubjects = 6;

        String[][] studentMarks = new String[totalStudents][totalSubjects+1];
        studentMarks[0][0] = "Madan";
        studentMarks[0][1] = "76";
        studentMarks[0][2] = "55";
        studentMarks[0][3] = "92";
        studentMarks[0][4] = "100";
        studentMarks[0][5] = "78";
        studentMarks[0][6] = "83";

        studentMarks[1][0] = "John";
        studentMarks[1][1] = "72";
        studentMarks[1][2] = "54";
        studentMarks[1][3] = "91";
        studentMarks[1][4] = "91";
        studentMarks[1][5] = "87";
        studentMarks[1][6] = "85";

        studentMarks[2][0] = "Lucy";
        studentMarks[2][1] = "78";
        studentMarks[2][2] = "67";
        studentMarks[2][3] = "79";
        studentMarks[2][4] = "92";
        studentMarks[2][5] = "75";
        studentMarks[2][6] = "100";

       // System.out.println(Arrays.deepToString(studentMarks));
        System.out.println(studentMarks.length);
        for(int i=0;i<studentMarks.length;i++) {
            for (int j=0;j<studentMarks[i].length;j++) {
                System.out.print(studentMarks[i][j]+" ");
            }
            System.out.println();
        }

    }

}
