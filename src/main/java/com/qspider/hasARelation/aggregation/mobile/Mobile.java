package com.qspider.hasARelation.aggregation.mobile;

public class Mobile {
    String comp;
    int price;
    String color;
    Sim s;

    public Mobile(String comp, int price, String color) {
        this.comp = comp;
        this.price = price;
        this.color = color;
    }
    public void toPrint(Sim s){
        this.s=s;
        System.out.println("Mobile Company:- "+comp);
        System.out.println("Mobile Price:- "+price);
        System.out.println("Mobile color:- "+color);
        System.out.println("Service Provider :-" +s.serviceProvider);
        System.out.println("Sim Number:- "+s.sNum );
    }
}
