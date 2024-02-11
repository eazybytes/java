package com.eazybytes.newapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class GetPlusMinusMethodsDemo {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015, 3 , 18);
        int year = localDate.getYear(); // 2015
        Month month = localDate.getMonth(); // MARCH
        int day  = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        LocalDateTime localDateTime = LocalDateTime.now();
        int hour = localDateTime.getHour();

        LocalDate ld1 = localDate.plusDays(6); // 2015-03-24
        LocalDate ld2 = localDate.plusMonths(6); // 2015-09-18
        LocalDate ld3 = localDate.plusWeeks(2); // 2015-04-01

        LocalDate ld4 = localDate.minusMonths(9); // 2014-06-18
        LocalDate ld5 = localDate.minusYears(7); // 2008-03-18

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld4);
        System.out.println(ld5);

    }

}
