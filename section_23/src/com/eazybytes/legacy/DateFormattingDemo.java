package com.eazybytes.legacy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormattingDemo {

    public static void main(String[] args) throws ParseException {
        Date currentDate = new Date();
        System.out.println(currentDate); // Fri Feb 09 14:52:01 IST 2024
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MMMM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println(formattedDate);

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate1 = dateFormat1.format(currentDate);
        System.out.println(formattedDate1);

        String dateString = "2100-09-26 14:30:00";
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate = dateFormat2.parse(dateString);
        System.out.println(parsedDate);

    }

}
