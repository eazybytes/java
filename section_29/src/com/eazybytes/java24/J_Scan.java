package com.eazybytes.java24;

import java.util.List;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class J_Scan {

    public static void main(String[] args) {

        List<Integer> runningSums = Stream.of(1, 2, 3, 4)
                .gather(
                        Gatherers.scan(() -> 0, (sum, next) -> sum + next)
                )
                .toList();

        System.out.println(runningSums); // Output: [1, 3, 6, 10]

    }
}
