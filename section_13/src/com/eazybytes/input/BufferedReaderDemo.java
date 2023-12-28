package com.eazybytes.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Please enter a value...");
        String input = bf.readLine();
        System.out.println("The user entered a value: "+ input);
        bf.close();
    }

}
