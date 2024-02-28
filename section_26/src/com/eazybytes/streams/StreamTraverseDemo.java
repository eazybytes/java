package com.eazybytes.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTraverseDemo {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        Stream<String> depStream = departmentList.stream();
        depStream.forEach(System.out::println);
        depStream.forEach(System.out::println);
    }

}
