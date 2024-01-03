package com.eazybytes.exception;

import com.eazybytes.exception.custom.InvalidAgeException;

import java.util.Scanner;

public class AcceptAgeDetails {

    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = scanner.nextInt();
        if(age<0 || age>100) {
            throw new InvalidAgeException("Invalid age details entered. Please enter a age between 0-100");
        }
        System.out.println("Your age is : "+age);
    }

}
