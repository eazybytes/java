package com.eazybytes.newapi;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Asia/Kolkata");
        ZoneId destZone = ZoneId.of("America/Chicago");

        ZonedDateTime indiaDateTime = ZonedDateTime.now(zone);
        ZonedDateTime chicagoDateTime = indiaDateTime.withZoneSameInstant(destZone);
        System.out.println(indiaDateTime);
        System.out.println(chicagoDateTime);

        ZoneOffset offset = ZoneOffset.ofHours(2);
        ZoneOffset destOffset = ZoneOffset.ofHours(-8);

        ZonedDateTime utc2DateTime = ZonedDateTime.now(offset);
        ZonedDateTime utcDestDateTime = indiaDateTime.withZoneSameInstant(destOffset);
        System.out.println(utc2DateTime);
        System.out.println(utcDestDateTime);
    }

}
