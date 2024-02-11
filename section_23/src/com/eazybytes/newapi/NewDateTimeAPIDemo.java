package com.eazybytes.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class NewDateTimeAPIDemo {

    public static void main(String[] args) {
        LocalDate dateOnly = LocalDate.now();
        LocalTime timeOnly = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime dateTimeWithZone = ZonedDateTime.now();
        System.out.println(dateOnly);
        System.out.println(timeOnly);
        System.out.println(dateTime);
        System.out.println(dateTimeWithZone);
    }

}
