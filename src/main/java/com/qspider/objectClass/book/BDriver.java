package com.qspider.objectClass.book;

import java.util.Scanner;

public class BDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book author : ");
        String name=sc.next();
        System.out.println("Enter the pages : ");
        int pg=sc.nextInt();
        Book book=new Book(name,pg);
        System.out.println(book);
    }
}
