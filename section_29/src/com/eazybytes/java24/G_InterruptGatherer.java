package com.eazybytes.java24;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class G_InterruptGatherer {

    public static void main(String[] args) {
        List<Integer> largeList = Stream.iterate(1, i -> i + 1)
                .limit(1000)
                .toList(); // simulate a large list
        Gatherer<Integer, ?, Integer> limitGatherer = Gatherer.of(
                (_, element, downstream) -> {
                    System.out.println(element);
                    downstream.push(element);
                    return true;
                });
        var res = largeList.stream().parallel().gather(limitGatherer).limit(10).toList();
        System.out.println(res);
        // Downstream is going to start in non rejecting state
        // A downstream can only go from non-rejecting → rejecting
        // The state only changes when you push an element to it
    }
}
