package com.eazybytes.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamDemo {

    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(1, num -> num+1).limit(100).parallel();
        long startTime = System.currentTimeMillis();
        System.out.println(numStream.map( num -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return num * 2;
        }).collect(Collectors.toList()));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

}
