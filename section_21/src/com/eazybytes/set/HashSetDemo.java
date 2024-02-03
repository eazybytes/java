package com.eazybytes.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> visitedCountries = new HashSet<>();
        visitedCountries.add("India");
        visitedCountries.add("USA");
        visitedCountries.add("Dubai");
        visitedCountries.add("Singapore");
        visitedCountries.add("France");
        visitedCountries.add("India");
        System.out.println(visitedCountries.size());
        System.out.println(visitedCountries);
        boolean isDubai = visitedCountries.contains("Germany");
        System.out.println(isDubai);
        boolean isRemoved = visitedCountries.remove("Singapore");
        System.out.println(isRemoved);
        System.out.println(visitedCountries);
    }

}
