package com.qspider.isARelation.inheritance.typeCasting.book;

public class HarryPotter extends Book{
    private String name="hp";
    private String author="jk";
    private int pages=100;
    private int price=50;

    public HarryPotter(int quantity) {
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
