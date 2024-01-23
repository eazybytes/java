package com.eazybytes.list;

import java.util.*;

public class ArrayListListIteratorExample {

    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");
        ListIterator<String> listIterator = countryNames.listIterator();
        while (listIterator.hasNext()) {
            String country = listIterator.next();
            System.out.println(country);
        }
        while (listIterator.hasPrevious()) {
            String country = listIterator.previous();
            System.out.println(country);
        }

    }

}
