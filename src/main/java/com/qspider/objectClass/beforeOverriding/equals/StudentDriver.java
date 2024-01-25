package com.qspider.objectClass.beforeOverriding.equals;

public class StudentDriver {
    public static void main(String[] args) {
        Student student=new Student("pallavi",14);
        Student student1=new Student("pallavi", 14);
        System.out.println(student.equals(student1));//call from object class it compair th object address and its address is differnt
    }
}
