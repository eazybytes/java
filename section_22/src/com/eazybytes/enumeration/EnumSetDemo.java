package com.eazybytes.enumeration;

import java.util.EnumSet;

public class EnumSetDemo {

    public static void main(String[] args) {
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        EnumSet<Day> someDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);
        for(Day day : someDays){
            System.out.println(day);
        }

        EnumSet<Grades> passGrades = EnumSet.range(Grades.A, Grades.C);
        for(Grades grade : passGrades){
            System.out.println(grade);
        }

        EnumSet<Grades> failGrades = EnumSet.complementOf(passGrades);
        for(Grades grade : failGrades){
            System.out.println(grade);
        }
    }

}
