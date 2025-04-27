package com.eazybytes.java24;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class F_ParallelGatherer {

    public static void main(String[] args) {
        Gatherer<Integer, ? , Integer> parallelSum =
                Gatherer.of(AtomicInteger::new,
                        (sum, number, downstream) -> {
                            System.out.printf("[Integrator] Thread: %s | number: %d%n",
                                    Thread.currentThread().getName(), number);
                            sum.addAndGet(number);
                            return true;
                        },
                        (s1,s2) -> {
                            System.out.printf("[Combiner] Thread: %s | combining %d + %d%n",
                                    Thread.currentThread().getName(), s1.get(), s2.get());
                            s1.addAndGet(s2.get()); // combiner
                            return s1;
                        },
                        (sum,downstream) -> {
                            System.out.printf("[Finisher] Thread: %s | result: %d%n",
                                    Thread.currentThread().getName(), sum.get());
                             downstream.push(sum.get());
                });

        var result = Stream.of(10, 20, 30, 40, 50, 60).parallel().gather(parallelSum).toList();
        System.out.println(result);
    }
}
