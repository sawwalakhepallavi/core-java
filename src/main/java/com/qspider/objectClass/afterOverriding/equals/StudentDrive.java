package com.qspider.objectClass.afterOverriding.equals;


public class StudentDrive {
    public static void main(String[] args) {
        Student student=new Student("pallavi",14);
        Student student1=new Student("pallavi", 14);
        System.out.println(student.equals(student1));//overrided method call and compair  the attribute
    }
}
