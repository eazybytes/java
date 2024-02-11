package com.eazybytes.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ToAndAtMethodsDemo {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.MARCH, 18, 22, 30);
        System.out.println(dateTime);

        LocalDate date = dateTime.toLocalDate();
        LocalTime time = dateTime.toLocalTime();

        System.out.println(date);
        System.out.println(time);

        LocalDate localDate = LocalDate.of(2015, 3, 18);
        LocalDateTime startOfDay = localDate.atStartOfDay();
        System.out.println(startOfDay);
        LocalDateTime localDateTime = localDate.atTime(18, 20);
        System.out.println(localDateTime);

    }

}
