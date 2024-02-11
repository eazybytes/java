package com.eazybytes.newapi;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

public class JapaneseCalendarDemo {

    public static void main(String[] args) {
        JapaneseDate japaneseDate = JapaneseDate.now();
        LocalDate localDate = LocalDate.now();

        JapaneseDate japaneseDate1 = JapaneseDate.from(localDate);
        LocalDate localDate1 = LocalDate.from(japaneseDate);

    }

}
