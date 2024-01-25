package com.qspider.objectClass.afterOverriding.equals;

public class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public boolean equals(Object o){
        Student s1=(Student) o;
        return this.name.equals(s1.name) && this.id==s1.id;
    }
}
