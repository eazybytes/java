package com.eazybytes.method.reference;

import java.util.List;

public class ClassMethodReference {

    public static void main(String[] args) {
        var list = List.of("Supply", "HR", "Sales", "Marketing");
        list.forEach(department -> System.out.println(department));
        list.forEach(System.out::println);
    }

}
