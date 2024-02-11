package com.eazybytes.newapi;

import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTimeDemo {

    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.of(15, 30, 0, 0, ZoneOffset.ofHours(2));
        System.out.println(offsetTime);
        int hour = offsetTime.getHour();
        int minutes = offsetTime.getMinute();
        int second = offsetTime.getSecond();
        ZoneOffset offset = offsetTime.getOffset();
        OffsetTime laterTime = offsetTime.plusHours(2);
        boolean isBefore = offsetTime.isBefore(laterTime);

    }

}
