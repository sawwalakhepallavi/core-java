package com.qspider.collection.arraylist.bank;

public class Account {
    public String name;
    public long account_no;
    public  String ifsc;
    public int password;
    public String city;
    public double balance;
    public long contact_no;

    public Account(String name, long account_no, String ifsc, int password, String city, double balance, long contact_no) {
        this.name = name;
        this.account_no = account_no;
        this.ifsc = ifsc;
        this.password = password;
        this.city = city;
        this.balance = balance;
        this.contact_no = contact_no;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", account_no=" + account_no +
                ", ifsc='" + ifsc + '\'' +
                ", password=" + password +
                ", city='" + city + '\'' +
                ", balance=" + balance +
                ", contact_no=" + contact_no +
                '}';
    }
}
