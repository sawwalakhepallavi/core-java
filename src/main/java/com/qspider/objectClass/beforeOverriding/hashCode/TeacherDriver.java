package com.qspider.objectClass.beforeOverriding.hashCode;

public class TeacherDriver {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("pallavi",22);
        Teacher teacher1=new Teacher("pallavi",14);
        System.out.println(teacher);
        System.out.println(teacher1);
    }
}
