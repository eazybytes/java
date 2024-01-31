package com.eazybytes.map;

import java.util.Map;
import static java.util.Map.entry;

public class ImmutableMapDemo {

    public static void main(String[] args) {
        Map<String,Integer> stringIntegerMap = Map.of("a",1,"b",2,"c",3);
        processMap(stringIntegerMap);

        Map<Integer,String> integerStringMap = Map.ofEntries(entry(1, "Tom"),
                    entry(2, "Dick"),
                    entry(3, "Harry"));
        processMap1(integerStringMap);

    }

    public static void processMap(Map<String,Integer> stringIntegerMap) {
        for(Map.Entry<String,Integer> entry : stringIntegerMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void processMap1(Map<Integer,String> integerStringMap) {
        for(Map.Entry<Integer,String> entry : integerStringMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }


}
