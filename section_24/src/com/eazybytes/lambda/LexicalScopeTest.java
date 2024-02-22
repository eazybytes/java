package com.eazybytes.lambda;

public class LexicalScopeTest {

    public static void main(String[] args) {
        String input = "Hello World";
        Printer printer = input1 -> {
            String msg = "Hi";
            System.out.println(input1+input+msg);
        };
        printer.print(input);

    }

}
