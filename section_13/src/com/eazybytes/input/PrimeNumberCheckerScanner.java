package com.eazybytes.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrimeNumberCheckerScanner {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a numeric value to identify if it is a prime number or not...");
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("Given number is a prime number");
        }else {
            System.out.println("Given number is not a prime number");
        }
        sc.close();
    }

    private static boolean isPrime(int num) {
        if(num<=1) {
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }

}
