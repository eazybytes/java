package com.eazybytes.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        Map<Integer,String> numbers = new TreeMap<>();
        numbers.put(23, "Twenty three");
        numbers.put(12, "Twelve");
        numbers.put(42, "Forty two");
        numbers.put(3, "Three");
        numbers.put(19, "Nineteen");
        numbers.put(48, "Forty eight");
        numbers.put(76, "Seventy six");

        for(Map.Entry<Integer,String> entry : numbers.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }

}
