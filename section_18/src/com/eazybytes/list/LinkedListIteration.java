package com.eazybytes.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {

    public static void main(String[] args) {
        var countryNames = new LinkedList<String>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        for(String countryName:countryNames){
            System.out.println(countryName.toUpperCase());
        }

        Iterator<String> iterator = countryNames.iterator();

        while (iterator.hasNext()) {
            String countryName = iterator.next();
            System.out.println(countryName.toLowerCase());
        }

        ListIterator<String> listIterator = countryNames.listIterator();

        while (listIterator.hasNext()) {
            String countryName = listIterator.next();
            System.out.println(countryName);
        }

        while (listIterator.hasPrevious()) {
            String countryName = listIterator.previous();
            System.out.println(countryName);
        }

    }

}
