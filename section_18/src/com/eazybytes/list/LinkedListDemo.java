package com.eazybytes.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        List<Double> doubleNums = new LinkedList<>();
        var countryNames = new LinkedList<String>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");
        System.out.println(countryNames);
        countryNames.set(4, "Spain");
        countryNames.remove("India");
        String firstElement = countryNames.getFirst();
        String lastElement = countryNames.getLast();
        System.out.println(countryNames);
        LinkedList<String> reversedCountryNames = countryNames.reversed();
        System.out.println(reversedCountryNames);

    }

}
