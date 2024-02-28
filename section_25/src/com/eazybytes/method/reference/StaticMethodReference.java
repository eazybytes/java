package com.eazybytes.method.reference;

public class StaticMethodReference {

    public static void main(String[] args) {
        ArithmeticOperation operation = (a,b) -> {
           int sum = a + b;
            System.out.println(sum);
            return sum;
        };
        operation.performOperation(2,3);

        ArithmeticOperation methodReference = StaticMethodReference::performAddition;
        methodReference.performOperation(2,3);

    }

    public static int performAddition(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

}
