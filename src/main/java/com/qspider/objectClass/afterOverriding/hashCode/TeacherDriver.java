package com.qspider.objectClass.afterOverriding.hashCode;

public class TeacherDriver {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("pallavi",14);
        Teacher t1=new Teacher("pallavi", 14);
        System.out.println(teacher);
        System.out.println(t1);
    }
}
