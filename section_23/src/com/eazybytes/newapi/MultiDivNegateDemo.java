package com.eazybytes.newapi;

import java.time.Duration;
import java.time.Period;

public class MultiDivNegateDemo {

    public static void main(String[] args) {
        Duration originalDuration = Duration.ofMinutes(30); // PT30M
        Duration multipliedDuration = originalDuration.multipliedBy(3); // PT1H30M
        Duration dividedDuration = originalDuration.dividedBy(2); // PT15M
        Duration negatedDuration = originalDuration.negated(); // PT-30M

        Period originalPeriod = Period.ofDays(3); // P3D
        Period multipliedPeriod = originalPeriod.multipliedBy(3); // P9D
        Period negatedPeriod = originalPeriod.negated(); // P-3D
    }

}
