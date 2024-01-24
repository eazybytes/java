package com.eazybytes.list;

import java.util.Comparator;

public class LastCharComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        char lastChar1 = o1.charAt(o1.length()-1);
        char lastChar2 = o2.charAt(o2.length()-1);
        return Character.compare(lastChar2,lastChar1);
    }
}
