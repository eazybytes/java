package com.eazybytes.java24;

import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class H_ChainingGatherer {

    public static void main(String[] args) {
        Gatherer<String, ?, String> upper = Gatherer.of
                ((_, element, downstream) -> downstream.push(element.toUpperCase()));

        Gatherer<String, ?, String> filter = Gatherer.of((_, element, downstream) -> {
            if (element.startsWith("J")) {
                downstream.push(element);
            }
            return true;
        });

        var result = Stream.of("java", "spring", "react").gather(upper.andThen(filter)).toList();
        System.out.println(result);

    }
}
