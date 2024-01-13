package com.qspider.hasARelation.aggregation.bank;

public class Account {
    private String name;
    private long account_no;
    private  String ifsc;
    private int password;
    private String city;
    private double balance;
    private long contact_no;

    public Account(String name, long account_no, String ifsc, int password, String city, double balance, long contact_no) {
        this.name = name;
        this.account_no = account_no;
        this.ifsc = ifsc;
        this.password = password;
        this.city = city;
        this.balance = balance;
        this.contact_no = contact_no;
    }

    public String getName() {
        return name;
    }

    public long getAccount_no() {
        return account_no;
    }

    public String getIfsc() {
        return ifsc;
    }

    public int getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }

    public double getBalance() {
        return balance;
    }

    public long getContact_no() {
        return contact_no;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setContact_no(long contact_no) {
        this.contact_no = contact_no;
    }
}
