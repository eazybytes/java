package com.eazybytes.legacy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarDemo {

    public static void main(String[] args) {
        Calendar currentDate = Calendar.getInstance();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2100, Calendar.JANUARY, 1);
        System.out.println(currentDate);
        Date currentDateObj = gregorianCalendar.getTime();
        System.out.println(currentDateObj);

        int year = gregorianCalendar.get(Calendar.YEAR);
        int month = gregorianCalendar.get(Calendar.MONTH);
        int date = gregorianCalendar.get(Calendar.DATE);
        int hour = gregorianCalendar.get(Calendar.HOUR_OF_DAY);
        int minutes = gregorianCalendar.get(Calendar.MINUTE);
        int seconds = gregorianCalendar.get(Calendar.SECOND);
        int milliSeconds = gregorianCalendar.get(Calendar.MILLISECOND);

        System.out.printf("Current Date and Time in : %04d-%02d-%02d %02d:%02d:%02d:%04d%n",
                year, month, date, hour, minutes, seconds,milliSeconds);

        gregorianCalendar.set(Calendar.YEAR, 2101);
        gregorianCalendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        Date currentDateObj1 = gregorianCalendar.getTime();
        System.out.println(currentDateObj1);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(gregorianCalendar.getTime());
        System.out.println(formattedDate);

        gregorianCalendar.add(Calendar.HOUR, 2);
        gregorianCalendar.add(Calendar.MONTH, -3);
        formattedDate = dateFormat.format(gregorianCalendar.getTime());
        System.out.println(formattedDate);

        boolean isLeapYear = gregorianCalendar.isLeapYear(2049);
        System.out.println(isLeapYear);


    }

}
