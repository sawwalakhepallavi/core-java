package com.qspider.objectClass.afterOverriding.toString;

public class StudentDriver {
    public static void main(String[] args) {
        Student student=new Student("pallavi",22);
        System.out.println(student);//override the Object class method toString for the attribute printing
    }
}
