package com.eazybytes.input;

import java.io.IOException;

public class JavaBasicInputDemo {

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a value...");
        int num = System.in.read();
        System.out.println("The user entered a value: "+ num);
    }

}
