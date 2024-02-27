package com.qspider.collection.arraylist.student;

import com.qspider.collection.arraylist.student.School;

import java.util.Scanner;

public class SSDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        School s1=new School();
        boolean exit=true;
        while(exit){
            System.out.println("Enter the choice" +
                    "\n1.Take Admission" +
                    "\n2.Cancel Admission" +
                    "\n3.update std" +
                    "\n4.Display details");
            int choice=sc.nextInt();
            switch (choice){
                case 1:{
                    s1.takeAdmission();
                }break;
                case 2:{
                    s1.cancelAdmission();
                }break;
                case 3:{
                    s1.updateStd();
                }break;
                case 4:{
                    s1.displayDetails();
                }break;
                case 5:{
                    exit=false;
                    System.out.println("Application close.....");
                }
            }
        }
    }
}
