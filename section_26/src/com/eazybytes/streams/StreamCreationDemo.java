package com.eazybytes.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationDemo {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        Stream<String> depStream = departmentList.stream();
        // depStream.parallel();
        depStream.forEach(System.out::println);

        Stream<String> inStream = Stream.of("Eazy", "Bytes", "Java");
        inStream.forEach(System.out::println);

        Stream<String> parallelStream = departmentList.parallelStream();
        parallelStream.forEach(System.out::println);

        String[] arrayOfWords = {"Eazy", "Bytes"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        Stream<String> emptyString = Stream.empty();

        // Stream.generate(new Random()::nextInt).forEach(System.out::println);
        // Stream.iterate(1,n -> n+1).forEach(System.out::println);
    }

}
