package com.qspider.Interface.normal;

public class Books implements Book{

    @Override
    public void add() {
        System.out.println("Hello im call from add method ");
    }

    public static void main(String[] args) {
        Books b1=new Books();
        System.out.println("im from main method");
        b1.add();
    }
}
