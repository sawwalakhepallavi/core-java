package com.qspider.objectClass.book;

public class Book {
    public String Author;
    public int pages;

    public Book(String author, int pages) {
        Author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
