package com.eazybytes.legacy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDatesDemo {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String formattedDate = dateFormat.format(new Date());
        System.out.println(formattedDate);
        dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Vatican"));
        formattedDate = dateFormat.format(new Date());
        System.out.println(formattedDate);

        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));
        int year = gregorianCalendar.get(Calendar.YEAR);
        int month = gregorianCalendar.get(Calendar.MONTH);
        int date = gregorianCalendar.get(Calendar.DATE);
        int hour = gregorianCalendar.get(Calendar.HOUR_OF_DAY);
        int minutes = gregorianCalendar.get(Calendar.MINUTE);
        int seconds = gregorianCalendar.get(Calendar.SECOND);
        int milliSeconds = gregorianCalendar.get(Calendar.MILLISECOND);

        System.out.printf("Current Date and Time in : %04d-%02d-%02d %02d:%02d:%02d:%04d%n",
                year, month, date, hour, minutes, seconds,milliSeconds);

        System.out.println(gregorianCalendar.getTime());

    }

}
