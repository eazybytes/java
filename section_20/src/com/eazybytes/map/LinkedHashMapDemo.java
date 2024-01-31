package com.eazybytes.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(4, "Four");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(7, "Seven");
        linkedHashMap.put(2, "Two");

        for(Map.Entry<Integer,String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        SequencedMap<Integer,String> reversedLinkedHashMap = linkedHashMap.reversed();

        for(Map.Entry<Integer,String> entry : reversedLinkedHashMap.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

}
