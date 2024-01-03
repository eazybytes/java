package com.eazybytes.exception;

public class Division {

    public double divide (String num1, String num2) throws
            NumberFormatException, ArithmeticException {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        return n1/n2;
    }

}
