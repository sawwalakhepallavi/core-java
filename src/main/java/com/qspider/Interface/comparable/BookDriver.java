package com.qspider.Interface.comparable;

import java.util.Arrays;

public class BookDriver {
    public static void main(String[] args) {
        Book book[] =new Book[5];

        book[0]=new Book("java",1);
        book[1]=new Book("c",2);
        book[2]=new Book("python",4);
        book[3]=new Book("c++",5);
        book[4]=new Book("sql",3);

        for(int i=0;i<book.length;i++){
            System.out.println(book[i]);
        }
        System.out.println("----------------After sorting-----------------");

        Arrays.sort(book);
        for(int i=0;i<book.length;i++){
            System.out.println(book[i]);
        }

    }
}
