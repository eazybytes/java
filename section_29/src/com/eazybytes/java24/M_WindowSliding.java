package com.eazybytes.java24;

import java.util.List;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class M_WindowSliding {

    public static void main(String[] args) {
        List<List<Integer>> result =
                Stream.of(1,2,3,4,5,6,7,8)
                        .gather(Gatherers.windowSliding(2)).toList();
        System.out.println(result);
    }
}
