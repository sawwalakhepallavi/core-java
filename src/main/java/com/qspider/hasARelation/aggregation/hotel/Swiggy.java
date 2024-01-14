package com.qspider.hasARelation.aggregation.hotel;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Swiggy {
    Customer customer;
    Hotel hotel;
    Scanner scanner=new Scanner(System.in);

    public void createAccount(Customer customer){
        if(this.customer==null){
            this.customer=customer;
            System.out.println("Account created successfully....!");
        }else{
            System.out.println("Already Exist...!");
        }
    }
    public void selectHotel(Hotel hotel){
        if(this.customer!=null){
            this.hotel=hotel;
            System.out.println("Your Order is placed...!" +
                    "\n--------wait some time------------");
        }else {
            System.out.println("Please create the Customer account ur order is not placed...!");
        }

    }
    public  void displayDetails(){
        if(this.customer!=null && this.hotel!=null){
            System.out.println("--------------Details Of Customer---------------");
            System.out.println("Name of customer : "+customer.getName()+
                    " Contact number : "+customer.getContactNumber()+
                    " City : "+customer.getCity());
            System.out.println("-----@Order Details-----");
            System.out.println("Order first food : "+hotel.getOrderF1()+
                    " Order second food : "+hotel.getOrderF2()+
                    " Order third food : "+hotel.getOrderF3());
        }else {
            System.out.println("please create the account and place the order");
        }
    }
    public void updateDetails(){
        System.out.println("Which details you want to update \n 1.Customer \n 2.Ordered Food \n 3.Both");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:{
                if(this.customer!=null){
                    System.out.println("--------------Update the Customer Details---------------");
                    System.out.println("Update the contact number : ");
                    Long pho=scanner.nextLong();
                    customer.setContactNumber(pho);
                    System.out.println("Enter the updated city : ");
                    String ct=scanner.next();
                    customer.setCity(ct);
                    System.out.println("Customer details are successfully updated");
                }else {
                    System.out.println("Please Create The Account ");
                }
            }
            break;
            case 2:{
                if(this.hotel!=null){
                    System.out.println("-----Update the Order Details-----");
                    System.out.println("Update first Food");
                    String food1=scanner.next();
                    hotel.setOrderF1(food1);
                    System.out.println("Update second Food");
                    String food2=scanner.next();
                    hotel.setOrderF2(food2);
                    System.out.println("Update third Food");
                    String food3=scanner.next();
                    hotel.setOrderF3(food3);
                    System.out.println("Your Order is Updated....!");
                }else {
                    System.out.println("please place the order....!");
                }
            }
            break;
            case 3:{
                if(this.customer!=null && this.hotel!=null){
                    System.out.println("--------------Update the Customer Details---------------");
                    System.out.println("Update the contact number : ");
                    Long pho=scanner.nextLong();
                    customer.setContactNumber(pho);
                    System.out.println("Enter the updated city : ");
                    String ct=scanner.next();
                    customer.setCity(ct);
                    System.out.println("-----Update the Order Details-----");
                    System.out.println("Update first Food");
                    String food1=scanner.next();
                    hotel.setOrderF1(food1);
                    System.out.println("Update second Food");
                    String food2=scanner.next();
                    hotel.setOrderF2(food2);
                    System.out.println("Update third Food");
                    String food3=scanner.next();
                    hotel.setOrderF3(food3);
                    System.out.println("Customer and Food details are successfully updated");
                }else {
                    System.out.println("please create the account and place the order");
                }
            }

        }

    }
    public void removeHotel(){
        if(this.hotel!=null){
            this.hotel=null;
            System.out.println("Hotel details are remove and the order history ");
        }else{
            System.out.println("Their is no Hotel details are available");
        }
    }
    public void deleteAccount(){
        if(this.customer!=null){
            this.customer=null;
            System.out.println("Delete the customer account...!");
        }else{
            System.out.println("No customer details or any account is present");
        }
    }
}
