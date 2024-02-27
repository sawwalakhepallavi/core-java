package com.qspider.collection.arraylist.swiggy;

import javafx.scene.SubScene;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Swiggy {
    Customer customer;
    Hotel hotel;

    ArrayList<Customer> custList=new ArrayList<>();
    ArrayList<Hotel> hotelList=new ArrayList<>();

    Scanner scanner=new Scanner(System.in);

    public void createCustomerAccount(){
        System.out.println("Enter the customer id");
        int id=scanner.nextInt();
        System.out.println("Enter the name : ");
        String nm=scanner.next();
        System.out.println("Enter the city : ");
        String ct=scanner.next();
        System.out.println("Enter the contact number : ");
        int cno=scanner.nextInt();
        customer=new Customer(id,nm,ct,cno);
        custList.add(customer);
        System.out.println("Customer Account created Successfully...!");
    }
    public void placeOrder(){
        System.out.println("Enter the Customer id to place order : ");
        int id=scanner.nextInt();
        for(Customer cs : custList){
            if(id==cs.cus_Id){
                System.out.println("Enter the Hotel name : ");
                String hname=scanner.next();
                System.out.println("Enter the food : ");
                String fd=scanner.next();
                System.out.println("Enter the quantity : ");
                int qt=scanner.nextInt();
                hotel=new Hotel(hname,fd,qt);
                hotelList.add(hotel);
                System.out.println("Order place Successfully.....!");
            }else {
                System.out.println("Please need to create an account...!");
            }
        }
    }
    public void cancelOrder(){
        System.out.println("Enter the Customer id to place order : ");
        int id=scanner.nextInt();
        for(Customer cs : custList){
            if(id==cs.cus_Id){
                hotelList.remove(hotel);
                System.out.println("Remove order successfully...!");
            }
            else {
                System.out.println("No such order here...");
            }
        }
    }

    public void displayDetailsOfOrder(){
        System.out.println("Enter the Customer id to check order : ");
        int id=scanner.nextInt();
        for(Customer cs : custList){
            if(id==cs.cus_Id){
                for(Hotel h: hotelList){
                    System.out.println(h);
                }
            }
        }
    }
    public void displayDetailsOfCustomer(){
        for(Customer c: custList){
            System.out.println(c);
        }
    }

}
