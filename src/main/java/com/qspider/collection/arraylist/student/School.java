package com.qspider.collection.arraylist.student;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    Student s;
    ArrayList<Student> a1=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void takeAdmission(){
        System.out.println("Enter the name :");
        String sname=sc.next();
        System.out.println("Enter the student id");
        int id=sc.nextInt();
        System.out.println("Enter the student std");
        int std=sc.nextInt();
        s=new Student(sname,id,std);
        a1.add(s);
        System.out.println("Admission successfully...");
    }
    public void cancelAdmission(){
        System.out.println("Enter the id of student to cancel Admission ");
        int id= sc.nextInt();
        for(Student st:a1){
            if (id==st.sid){
                a1.remove(id);
                System.out.println("Admission cqancel successfully...");
                return;
            }
        }
        System.out.println("Do not found");
    }
    public void updateStd(){
        System.out.println("Enter the Student id to update the std");
        int id=sc.nextInt();
        for (Student st:a1){
            if(id==st.sid){
                System.out.println("Enter the std to update");
                int std=sc.nextInt();
                s.std=std;
                System.out.println("std update successfully.....");
                return;
            }
        }
        System.out.println("Student does not exists.....");
    }
    public void displayDetails(){
        System.out.println("Enter the id to display");
        int id=sc.nextInt();
        for(Student st: a1){
            if(id==st.sid){
                System.out.println(st);
                return;
            }
        }
        System.out.println("Student does not exists......");
    }

}
