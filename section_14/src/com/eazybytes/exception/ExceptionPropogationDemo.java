package com.eazybytes.exception;

import java.io.FileNotFoundException;

public class ExceptionPropogationDemo {

    public static void main(String[] args)  {
            method1();
          System.out.println("Main method");
    }

    static void method1()  {
        try{
            method2();
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

    static void method2() throws FileNotFoundException {
        method3();
    }

    static void method3() throws FileNotFoundException{
            throw new FileNotFoundException("File not found. Please check...");
    }

}
