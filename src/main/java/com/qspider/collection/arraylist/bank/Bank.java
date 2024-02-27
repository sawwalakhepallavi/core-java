package com.qspider.collection.arraylist.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    Account a;
    Scanner scanner=new Scanner(System.in);
    ArrayList<Account> ac=new ArrayList<>();

    public void createAccount(){
        System.out.println("Enter the name ");
        String name=scanner.next();
        System.out.println("Enter the account number ");
        long acNo=scanner.nextLong();
        System.out.println("Enter the ifsc number");
        String ifsc=scanner.next();
        System.out.println("Enter the password");
        int pass=scanner.nextInt();
        System.out.println("Enter the city");
        String city=scanner.next();
        System.out.println("Enter the balance");
        double bal=scanner.nextDouble();
        System.out.println("Enter the contact Number");
        long cont=scanner.nextLong();
        a=new Account(name,acNo,ifsc,pass,city,bal,cont);
        ac.add(a);
        System.out.println("Account created successfully.....");
    }
    public void removeAccount(){
        System.out.println("Enter the password");
        int pass=scanner.nextInt();
        for(Account at: ac){
            if(pass==at.password){
                ac.remove(at);
                System.out.println("Account is deleted successfully....!");
            }
        }
            System.out.println("Incorrect password....!");
    }
//    public void updateDetails(){
//        System.out.println("Enter the password");
//        int pswd=scanner.nextInt();
//        if(pswd== account.getPassword()){
//            System.out.println("Update the city");
//            String city=scanner.next();
//            account.setCity(city);
//            System.out.println("update the phone number");
//            long pho=scanner.nextInt();
//            account.setContact_no(pho);
//            System.out.println("Update successfully...!");
//        }else {
//            System.out.println("Incorrect password....!");
//        }
//    }
//    public void displayDetails(){
//        System.out.println("Enter the password");
//        int pswd=scanner.nextInt();
//        if(pswd== account.getPassword()){
//            System.out.println("Account holder name:-"+ account.getName());
//            System.out.println("Account number:-"+account.getAccount_no());
//            System.out.println("IFSC code:-"+account.getIfsc());
//            System.out.println("City:-" +account.getCity());
//            System.out.println("Contact number:-"+account.getContact_no());
//        }else {
//            System.out.println("Incorrect password....!");
//        }
//    }
//    public void deposit(){
//        System.out.println("Enter the password");
//        int pswd=scanner.nextInt();
//        if(pswd== account.getPassword()){
//            System.out.println("hom much amount you want to deposit");
//            double amt=scanner.nextDouble();
//            double bal=account.getBalance();
//            double sum=bal+amt;
//            account.setBalance(sum);
//            System.out.println("Total balance is :-" +sum);
//        }else {
//            System.out.println("Incorrect password....!");
//        }
//
//    }
//    public void withdraw(){
//        System.out.println("Enter the password");
//        int pswd=scanner.nextInt();
//        if(pswd== account.getPassword()){
//            System.out.println("hom much amount you want to withdraw");
//            double amt=scanner.nextDouble();
//            double bal=account.getBalance();
//            if(bal>amt){
//                double sub=bal-amt;
//                account.setBalance(sub);
//                System.out.println("Total balance is :-" +sub);
//            }else {
//                System.out.println("Insufficient balance...!");
//            }
//        }else {
//            System.out.println("Incorrect password....!");
//        }
//
//    }
//    public void checkBalance(){
//        System.out.println("Enter the password");
//        int pswd=scanner.nextInt();
//        if(pswd== account.getPassword()){
//            System.out.println("Balance is:-"+account.getBalance());
//        }else {
//            System.out.println("Incorrect password....!");
//        }
//    }
//    public void changePassword(){
//        System.out.println("Enter the password");
//        int pswd=scanner.nextInt();
//        if(pswd== account.getPassword()){
//            System.out.println("are u want to change password");
//            int npswd=scanner.nextInt();
//            account.setPassword(npswd);
//            System.out.println("Password Change successfully.....!");
//        }else {
//            System.out.println("Incorrect password....!");
//        }
//    }
}
