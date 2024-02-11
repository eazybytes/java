package com.eazybytes.legacy;

import java.sql.Date;

public class JavaSQLDate {

    public static void main(String[] args) {
        Date currentDate = new Date(System.currentTimeMillis());
        java.util.Date currentDate1 = new java.util.Date(System.currentTimeMillis());
        System.out.println(currentDate);
        System.out.println(currentDate1);
    }

}
