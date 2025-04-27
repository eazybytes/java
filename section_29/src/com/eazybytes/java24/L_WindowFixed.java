package com.eazybytes.java24;

import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class L_WindowFixed {

    public static void main(String[] args) {
        var output = Stream.of(1, 2, 3, 4, 5, 6)
                .gather(Gatherers.windowFixed(2))
                .toList();
        System.out.println(output);
    }
}
