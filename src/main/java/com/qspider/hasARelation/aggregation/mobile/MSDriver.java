package com.qspider.hasARelation.aggregation.mobile;

public class MSDriver {
    public static void main(String[] args) {
        Mobile m=new Mobile("Redmi",120000,"Blue");
        System.out.println("company name is "+m.comp+" price of mobile "+m.price+" Color of mobile  "+m.color);
        m.toPrint(new Sim("jio",2));
    }
}
