package com.eazybytes.newapi;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeDemo {

    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.ofHours(2);
        ZoneOffset destOffset = ZoneOffset.ofHours(-8);

        OffsetDateTime offsetDateTime = OffsetDateTime.now(offset);
        OffsetDateTime destOffsetDateTime = offsetDateTime.withOffsetSameInstant(destOffset);
        System.out.println(offsetDateTime);
        System.out.println(destOffsetDateTime);
    }

}
