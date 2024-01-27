package com.eazybytes.generics;

import java.util.ArrayList;

public class WithOutGenericsDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(true);

        String greeting = (String) list.get(0);
        int number = (Integer) list.get(1);
        boolean flag = (Boolean) list.get(2);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        // list1.add(123);
        // list1.add(true);

        String greeting1 = list1.get(0);
        // int number = (Integer) list.get(1);
        // boolean flag = (Boolean) list.get(0);

    }

}
