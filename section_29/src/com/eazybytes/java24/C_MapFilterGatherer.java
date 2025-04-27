package com.eazybytes.java24;

import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class C_MapFilterGatherer {

    public static void main(String[] args) {
        Gatherer<String,?, String> filterAndMapGatherer = Gatherer.of(
                (_, element, downstream) -> {
                    if(element.startsWith("a")) {
                        return downstream.push(element.toUpperCase());
                    }
                    return true;
                }
                );
        var result = Stream.of("apple", "banana", "avocado").gather(filterAndMapGatherer).toList();
        System.out.println(result);

    }
}
