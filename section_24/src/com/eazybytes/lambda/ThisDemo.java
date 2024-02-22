package com.eazybytes.lambda;

public class ThisDemo {

    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo();
        Printer lambdaPrinter = thisDemo.getLambdaPrinter();
        lambdaPrinter.print("Lambda Expression");
        Printer anonymousPrinter = thisDemo.getAnonymousPrinter();
        anonymousPrinter.print("Anonymous Inner Class");
    }

    public Printer getLambdaPrinter() {
        Printer printer = msg -> System.out.println(msg + " : " + this.getClass());
        return printer;
    }

    public Printer getAnonymousPrinter() {
        Printer printer = new Printer() {
            @Override
            public void print(String input) {
                System.out.println(input + " : " + this.getClass());
            }
        };
        return printer;
    }

}
