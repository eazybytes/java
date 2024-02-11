package com.eazybytes.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterDemo {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015,3,18);
        LocalTime localTime = LocalTime.of(15,30,0);
        LocalDateTime localDateTime = LocalDateTime.of(2015,3,18,15,30,0);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = dateFormatter.format(localDate);
        System.out.println(formattedDate);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        String formattedTime = timeFormatter.format(localTime);
        System.out.println(formattedTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm a");
        String formattedDateTime = dateTimeFormatter.format(localDateTime);
        System.out.println(formattedDateTime);

        String formattedDate1 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(formattedDate1);

        DateTimeFormatter germanFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMAN);
        String formattedDateGermany = germanFormatter.format(localDate);
        System.out.println(formattedDateGermany);



    }

}
