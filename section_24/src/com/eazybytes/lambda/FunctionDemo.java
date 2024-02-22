package com.eazybytes.lambda;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String, String> convertStr = input -> input.toUpperCase();
        System.out.println(convertStr.apply("Eazy Bytes"));

        Function<String, Integer> getStrLength = input -> input.length();
        System.out.println(getStrLength.apply("Eazy Bytes"));

        Function<String, String> sameValue = Function.identity();
        System.out.println(sameValue.apply("Hi Madan"));

        Function<Integer, Integer> doubleValue = num -> num * 2;
        Function<Integer, Integer> addThree = num -> num + 3;

        Function<Integer, Integer> output1 = doubleValue.andThen(addThree);
        Function<Integer, Integer> output2 = doubleValue.compose(addThree);
        System.out.println(output1.apply(5)); // 13
        System.out.println(output2.apply(5)); // 16

    }

}
