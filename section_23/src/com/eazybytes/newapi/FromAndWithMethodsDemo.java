package com.eazybytes.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class FromAndWithMethodsDemo {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.MARCH, 18, 22, 30);
        System.out.println(dateTime);

        LocalDate derivedDate = LocalDate.from(dateTime);
        LocalTime derivedTime = LocalTime.from(dateTime);
        System.out.println(derivedDate);
        System.out.println(derivedTime);

        LocalDateTime dateTime1 = dateTime.withYear(2030);
        LocalDateTime dateTime2 = dateTime.withYear(2030).withMonth(10);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

    }

}
