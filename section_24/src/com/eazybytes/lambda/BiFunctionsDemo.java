package com.eazybytes.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunctionsDemo {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumEven = (num1, num2) -> (num1+num2) % 2 == 0;
        System.out.println(isSumEven.test(4,9)); // false

        BiFunction<Double,Double,Double> calculatePower = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatePower.apply(2.0,3.0));

        BiConsumer<String, String> appendAndConvert = (word1, word2) ->
                    System.out.println((word1+word2).toUpperCase());
        appendAndConvert.accept("Hello ", "Eazy Bytes");

        BiConsumer<String, String> appendAndLength = (word1, word2) ->
                System.out.println((word1+word2).length());
        appendAndLength.accept("Hello ", "Eazy Bytes");

        BinaryOperator<Double> calculatePowerWithBO = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatePowerWithBO.apply(5.0,2.0));

        BinaryOperator<Integer> maxOperation = BinaryOperator.maxBy((a,b) -> Integer.compare(a,b));
        System.out.println(maxOperation.apply(16,30));

        BinaryOperator<Integer> minOperation = BinaryOperator.minBy((a,b) -> Integer.compare(a,b));
        System.out.println(minOperation.apply(16,30));

    }

}
