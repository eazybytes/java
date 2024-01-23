package com.eazybytes.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        List<Character> characters = new ArrayList<Character>();
        var doubleNums = new ArrayList<Double>();
        List<String> countryNames = new ArrayList<String>();
        System.out.println(countryNames.size());
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");
        System.out.println(countryNames);
        countryNames.add(1, "France");
        countryNames.set(4, "Spain");
        countryNames.remove("India");
        String firstElement = countryNames.getFirst();
        String lastElement = countryNames.getLast();
        String randomElement = countryNames.get(2);
        List<String> reversedCountryNames =countryNames.reversed();
        System.out.println(countryNames);
        System.out.println(reversedCountryNames);
    }

}
