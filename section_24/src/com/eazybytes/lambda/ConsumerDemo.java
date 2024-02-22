package com.eazybytes.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());
        convertAndDisplay.accept("Eazy Bytes");

        Consumer<Integer> squareOf = num -> System.out.println(num * num);
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbersList.forEach(squareOf);

        Consumer<String> appendInput = input -> System.out.println("New value after appending is : HELLO " + input);
        appendInput.andThen(convertAndDisplay).accept("Lambda Expression");
    }

}
