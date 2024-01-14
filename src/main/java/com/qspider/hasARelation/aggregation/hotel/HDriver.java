package com.qspider.hasARelation.aggregation.hotel;

import java.util.Scanner;

public class HDriver {
    public static void main(String[] args) {
        Swiggy swiggy=new Swiggy();
        Scanner scanner=new Scanner(System.in);
        boolean exit=true;
        while (exit){
            System.out.println("Are you want to create the account and order the food....." +
                    "\n -------------Welcome-----------------");
            System.out.println("1. Create Account" +
                    "\n2. Select Hotel" +
                    "\n3. Display Details" +
                    "\n4. Update Details" +
                    "\n5. Remove Hotel" +
                    "\n6. Delete Account" +
                    "\n7. Exit ");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Create the account" +
                            "\n Enter Your Name : ");
                    String nm=scanner.next();
                    System.out.println("Enter your contact number : ");
                    long cno=scanner.nextLong();
                    System.out.println("Enter your city : ");
                    String ct=scanner.next();
                    swiggy.createAccount(new Customer(nm,cno,ct));
                }
                break;
                case 2:{
                    System.out.println("-----------Place your order-----------" +
                            "\n Enter the hotel name : ");
                    String hnm= scanner.next();
                    System.out.println("Enter the branch : ");
                    String br= scanner.next();
                    System.out.println("Place the 1.food : ");
                    String fd1= scanner.next();
                    System.out.println("Place the 2.food : ");
                    String fd2= scanner.next();
                    System.out.println("Place the 3.food : ");
                    String fd3= scanner.next();
                    swiggy.selectHotel(new Hotel(hnm,br,fd1,fd2,fd3));
                }
                break;
                case 3:{
                    swiggy.displayDetails();
                }
                break;
                case 4:{
                    swiggy.updateDetails();
                }
                break;
                case 5:{
                    swiggy.removeHotel();
                }
                break;
                case 6:{
                    swiggy.deleteAccount();
                }
                break;
                case 7:{
                    exit=false;
                    System.out.println("------Exit From Application------------");
                }
            }

        }
    }
}
