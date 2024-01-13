package com.qspider.hasARelation.aggregation.bank;

import java.util.Scanner;

public class Bank {
    String bankName;
    String branch;
    Account account;
    Scanner scanner=new Scanner(System.in);
    public void createAccount(Account account){
        if(this.account==null){
            this.account=account;
            System.out.println("created successfully....!");
        }else{
            System.out.println("Already exist.....!");
        }

    }
    public void removeAccount(){
        System.out.println("Enter the password");
        int pswd=scanner.nextInt();
        if(pswd==account.getPassword()){
            this.account=null;
            System.out.println("Account is deleted successfully....!");
        }else {
            System.out.println("Incorrect password....!");
        }

    }
    public void updateDetails(){
        System.out.println("Enter the password");
        int pswd=scanner.nextInt();
        if(pswd== account.getPassword()){
            System.out.println("Update the city");
            String city=scanner.next();
            account.setCity(city);
            System.out.println("update the phone number");
            long pho=scanner.nextInt();
            account.setContact_no(pho);
            System.out.println("Update successfully...!");
        }else {
            System.out.println("Incorrect password....!");
        }
    }
    public void displayDetails(){
        System.out.println("Enter the password");
        int pswd=scanner.nextInt();
        if(pswd== account.getPassword()){
            System.out.println("Account holder name:-"+ account.getName());
            System.out.println("Account number:-"+account.getAccount_no());
            System.out.println("IFSC code:-"+account.getIfsc());
            System.out.println("City:-" +account.getCity());
            System.out.println("Contact number:-"+account.getContact_no());
        }else {
            System.out.println("Incorrect password....!");
        }
    }
    public void deposit(){
        System.out.println("Enter the password");
        int pswd=scanner.nextInt();
        if(pswd== account.getPassword()){
            System.out.println("hom much amount you want to deposit");
            double amt=scanner.nextDouble();
           double bal=account.getBalance();
           double sum=bal+amt;
           account.setBalance(sum);
            System.out.println("Total balance is :-" +sum);
        }else {
            System.out.println("Incorrect password....!");
        }

    }
    public void withdraw(){
        System.out.println("Enter the password");
        int pswd=scanner.nextInt();
        if(pswd== account.getPassword()){
            System.out.println("hom much amount you want to withdraw");
            double amt=scanner.nextDouble();
            double bal=account.getBalance();
            if(bal>amt){
                double sub=bal-amt;
                account.setBalance(sub);
                System.out.println("Total balance is :-" +sub);
            }else {
                System.out.println("Insufficient balance...!");
            }
        }else {
            System.out.println("Incorrect password....!");
        }

    }
    public void checkBalance(){
        System.out.println("Enter the password");
        int pswd=scanner.nextInt();
        if(pswd== account.getPassword()){
            System.out.println("Balance is:-"+account.getBalance());
        }else {
            System.out.println("Incorrect password....!");
        }
    }
    public void changePassword(){
        System.out.println("Enter the password");
        int pswd=scanner.nextInt();
        if(pswd== account.getPassword()){
            System.out.println("are u want to change password");
            int npswd=scanner.nextInt();
            account.setPassword(npswd);
            System.out.println("Password Change successfully.....!");
        }else {
            System.out.println("Incorrect password....!");
        }
    }

}
