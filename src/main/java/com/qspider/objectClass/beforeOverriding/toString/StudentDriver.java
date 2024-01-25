package com.qspider.objectClass.beforeOverriding.toString;

public class StudentDriver {
    public static void main(String[] args) {
        Student student=new Student("pallavi",22);
        System.out.println(student);// direct call object it will print the address of object becoz of tostring method call from Object class and return the String.
    }
}
