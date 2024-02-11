package com.eazybytes.legacy;

import java.util.Date;

public class JavaUtilDate {

    public static void main(String[] args) {

        Date currentDate = new Date(); // Current Date and time value
        currentDate.setYear(200);
        System.out.println(currentDate);
        long timeInms = currentDate.getTime();
        System.out.println(timeInms);

        Date futureDate = new Date(200, 8, 26, 8, 15,39);
        System.out.println(futureDate); //Sun Sep 26 08:15:39 IST 2100
        long timeInms1  = futureDate.getTime();
        System.out.println(timeInms1);
        Date date = new Date(timeInms1+86400000);
        System.out.println(date);

        boolean isAfter = date.after(futureDate);
        System.out.println(isAfter);
        /*
        In computing, an epoch is a fixed date and time used as a reference from
        which a computer measures system time.
         */

    }

}
