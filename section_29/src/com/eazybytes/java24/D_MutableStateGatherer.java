package com.eazybytes.java24;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class D_MutableStateGatherer {

    public static void main(String[] args) {
        // Input - 10, 20, 30, 40
        // Output - 10, 30, 60, 100
        Gatherer<Integer, AtomicInteger , Integer> cumulativeSum = Gatherer.
                ofSequential(AtomicInteger::new,
                (state,number,downstream) -> {
                    int updated = state.addAndGet(number);
                    return downstream.push(updated);
                });
        var result = Stream.of(10, 20, 30, 40).gather(cumulativeSum).toList();
        System.out.println(result);
    }
}
