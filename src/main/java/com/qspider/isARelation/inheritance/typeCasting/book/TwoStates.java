package com.qspider.isARelation.inheritance.typeCasting.book;

public class TwoStates extends Book{
    private String name="ts";
    private String author="cb";
    private int pages=500;
    private int price=100;

    public TwoStates(int quantity) {
        super(quantity);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getPrice() {
        return price;
    }
}
