package com.qspider.isARelation.inheritance.superConstructor;

import java.util.Scanner;

public class Pen extends Marker{

    int price;
    public Pen(String  comp, String  color,int price) {
        super(comp, color);
        this.price=price;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the company name : ");
        String comp=scanner.next();
        System.out.println("Enter the color : " );
        String colo= scanner.next();
        Pen pen=new Pen(comp,colo,50);
        System.out.println("------------Information of my pen---------");
        System.out.println("company of my pen "+pen.comp+" color of pen " +pen.color+" price of pen "+pen.price);
    }
}
