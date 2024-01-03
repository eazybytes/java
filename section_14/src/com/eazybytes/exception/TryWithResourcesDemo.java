package com.eazybytes.exception;

import java.util.Scanner;

public class TryWithResourcesDemo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number....");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch(Exception ex) {
            System.out.println("Please provide input in numerical format only and try again...");
        }
    }

}
