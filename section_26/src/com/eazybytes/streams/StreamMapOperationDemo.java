package com.eazybytes.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMapOperationDemo {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        departmentList.stream().map(word -> word.toUpperCase()).forEach(System.out::println);

        departmentList.stream()
                .map(word -> word.toUpperCase())
                .map(word -> "Hi "+word)
                .forEach(System.out::println);

    }


}
