package com.eazybytes.object.demo;

import java.lang.reflect.RecordComponent;

public class RecordDemo {

    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord("John", "Doctor");
        System.out.println(personRecord.name());
        System.out.println(personRecord.occupation());
        System.out.println(personRecord);
        Class personClass = personRecord.getClass();
        System.out.println(personClass.isRecord());
        RecordComponent[] recordComponents = personClass.getRecordComponents();
        for (RecordComponent r: recordComponents) {
            System.out.println(r.toString());
        }
    }

}
