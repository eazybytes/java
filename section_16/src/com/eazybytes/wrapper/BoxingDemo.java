package com.eazybytes.wrapper;

public class BoxingDemo {

    public static void main(String[] args) {
        int num = 16;

        // Approach 1 - With the help of Constructor
        Integer integer = new Integer(num);
        Double doubleObj = new Double(3.14);
        Long longObj = new Long("95657");

        // Approach 2 - With the help of valueOf()
        Integer integer1 = Integer.valueOf(num);
        Double doubleObj1 = Double.valueOf("3.14");
        Long longObj1 = Long.valueOf("95657");

        // Parsing
        int num1 = Integer.parseInt("18");
        System.out.println(num1);



    }

}
