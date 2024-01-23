package com.eazybytes.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {

    public static void main(String[] args) {
        List<Integer> accountNums = new ArrayList<>();
        accountNums.add(325454);
        accountNums.add(325455);
        accountNums.add(325456);
        accountNums = Collections.unmodifiableList(accountNums);
        List<Integer> immutableAccountNums = List.of(325454, 325455, 325456);
        var arrayListObject = new ArrayList<Integer>(immutableAccountNums);
        addTenDollars(arrayListObject);
    }

    private static List<Integer> addTenDollars(List<Integer> accountNums) {
        accountNums.add(545643);
        for(Integer account: accountNums) {
            System.out.println("Ten Dollars credited into the account : "+account);
        }
        return accountNums;
    }

}
