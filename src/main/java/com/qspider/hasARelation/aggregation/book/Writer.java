package com.qspider.hasARelation.aggregation.book;

import com.qspider.hasARelation.aggregation.book.Book;

public class Writer {
    int age;
    String name;
    Book book;

    public Writer(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void toPrint(Book book){
        this.book=book;
        System.out.println("Age is :-" +age);
        System.out.println("Name of writer :-" +name);
        System.out.println("Book author name :-"+book.bname);
        System.out.println("Number of pages :-" +book.pages);
    }
}
