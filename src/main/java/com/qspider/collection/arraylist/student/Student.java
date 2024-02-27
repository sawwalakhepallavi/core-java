package com.qspider.collection.arraylist.student;

public class Student {
    String sname;
    int sid;
    int std;

    public Student(String sname, int sid, int std) {
        this.sname = sname;
        this.sid = sid;
        this.std = std;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sid=" + sid +
                ", std=" + std +
                '}';
    }
}
