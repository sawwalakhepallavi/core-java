package com.qspider.hasARelation.aggregation.bank;

import java.util.Scanner;

public class BADriver {
    public static void main(String[] args) {
        Bank bank=new Bank();
        Scanner scanner=new Scanner(System.in);
        boolean exit=true;
        while (exit){
            System.out.println("What are you want \n1.Create account \n2.Remove Account \n3.Update Details \n4. Display Details \n5.Deposit \n6.Withdraw \n7.Check Balance \n8. Change Password");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:{
//                    System.out.println("please create an account");
                    System.out.println("Are u want to create");
                    System.out.println("In which bank You r create the Account");
                    String bname=scanner.next();
                    System.out.println("Enter the branch");
                    String bn=scanner.next();
                    System.out.println("Enter your name :-");
                    String nm=scanner.next();
                    System.out.println("Enter the account number");
                    long acno=scanner.nextLong();
                    System.out.println("Enter the ifsc ");
                    String ifsc=scanner.next();
                    System.out.println("Enter the password");
                    int pswd=scanner.nextInt();
                    System.out.println("Enter the city");
                    String city=scanner.next();
                    System.out.println("Enter the balance");
                    double bal= scanner.nextDouble();
                    System.out.println("Enter your phone number");
                    long cno=scanner.nextLong();
                    bank.createAccount(new Account(nm,acno,ifsc,pswd,city,bal,cno));
                }
                break;
                case 2:{
                    bank.removeAccount();
                }
                break;
                case 3:{
                    bank.updateDetails();
                }
                break;
                case 4:{
                    bank.displayDetails();
                }
                break;
                case 5:{
                    bank.deposit();
                }
                break;
                case 6:{
                    bank.withdraw();
                }
                break;
                case 7:{
                    bank.checkBalance();
                }
                break;
                case 8:{
                    bank.changePassword();
                }
                break;
                case 9:{
                    exit=false;
                    System.out.println("Exit to the information.....@copyWrite");
                }

            }
        }
    }
}
