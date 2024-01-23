package com.eazybytes.list;

public class Student implements Comparable<Student> {

    String name;
    int rollNumber;
    int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int marksComparision = Integer.compare(this.marks, o.marks);
        if(marksComparision==0) {
            return Integer.compare(this.rollNumber, o.rollNumber);
        }
        return marksComparision;
    }
}
