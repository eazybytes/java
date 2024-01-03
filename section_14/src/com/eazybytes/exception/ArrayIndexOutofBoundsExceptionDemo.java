package com.eazybytes.exception;

import java.util.logging.Logger;

public class ArrayIndexOutofBoundsExceptionDemo {

    private static Logger logger = Logger.getLogger(
            ArrayIndexOutofBoundsExceptionDemo.class.getName());

    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[5]);
        } catch (Exception ex) {
            logger.severe("Invalid Array index. Please try again with a valid index number");
        }

    }

}
