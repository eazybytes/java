package com.eazybytes.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetDemo {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(Arrays.asList("a","b","c"));
        stringSet = Collections.unmodifiableSet(stringSet);
        Set<String> stringSet1 = Set.of("a","b","c");
        processSet(stringSet1);
    }

    public static void processSet(Set<String> stringSet) {
        // stringSet.add("d");
        for (String element:stringSet) {
            System.out.println(element.toUpperCase());
        }
    }

}
