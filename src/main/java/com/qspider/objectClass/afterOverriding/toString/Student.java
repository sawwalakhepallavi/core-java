package com.qspider.objectClass.afterOverriding.toString;

public class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name+" "+id;
    }
}
