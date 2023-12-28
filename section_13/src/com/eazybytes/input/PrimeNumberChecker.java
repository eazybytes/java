package com.eazybytes.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberChecker {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Please enter a numeric value to identify if it is a prime number or not...");
        String input = bf.readLine();
        int num  = Integer.parseInt(input);
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("Given number is a prime number");
        }else {
            System.out.println("Given number is not a prime number");
        }
        bf.close();
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
