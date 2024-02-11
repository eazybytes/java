package com.eazybytes.newapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2013,1,1); // 2013-01-01
        LocalDate localDate2 = LocalDate.of(2015,3,18); // 2015-03-18
        Period period = Period.between(localDate1,localDate2); // P2Y2M17D
        System.out.println(period);

        Period oneYearTwoMonths = Period.of(1,2,0); // P1Y2M
        System.out.println(oneYearTwoMonths);
        Period threeDays = Period.ofDays(3); // P3D
        LocalDate localDate3 = localDate1.plus(oneYearTwoMonths); // 2014-03-01
        System.out.println(localDate3);
    }

}
