package com.eazybytes.java23;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static void sayHello() {
        System.out.println("Hello World");
    }

    public static void sayBye() {
        System.out.println("Bye World");
    }

    /**
     * Adds two numbers
     * @param num1 first number
     * @param num2 second number
     * @return sum of two numbers
     */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts two numbers
     * @param num1 first number
     * @param num2 second number
     * @return difference of two numbers
     */
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers
     * @param num1 first number
     * @param num2 second number
     * @return product of two numbers
     */
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divides two numbers
     * @param num1 first number
     * @param num2 second number
     * @return quotient of two numbers
     */
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }


}
