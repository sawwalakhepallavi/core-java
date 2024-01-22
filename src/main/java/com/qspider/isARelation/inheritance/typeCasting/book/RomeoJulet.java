package com.qspider.isARelation.inheritance.typeCasting.book;

public class RomeoJulet extends Book{
    private String name="pj";
    private String author="rahul";
    private int pages=100;
    private int price=100;

    public RomeoJulet(int quantity) {
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
