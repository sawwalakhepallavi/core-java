package com.qspider.collection.arraylist.swiggy;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Swiggy swiggy=new Swiggy();
        Scanner scanner=new Scanner(System.in);
        boolean exit=true;
        while(exit){
            System.out.println("Enter the choice" +
                    "\n1. Create Customer Account" +
                    "\n2. Place the order" +
                    "\n3. cancel Order" +
                    "\n4. display Details of Order for specific customer" +
                    "\n5. display all the customers" +
                    "\n6. Exit");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:{
                    swiggy.createCustomerAccount();
                }
                break;
                case 2:{
                    swiggy.placeOrder();
                }
                break;
                case 3:{
                    swiggy.cancelOrder();
                }
                break;
                case 4:{
                    swiggy.displayDetailsOfOrder();
                }
                break;
                case 5:{
                    swiggy.displayDetailsOfCustomer();
                }
                break;
                case 6:{
                    exit=false;
                    System.out.println("Exit from application...");
                }
            }
        }
    }
}
