package com.qspider.Interface;

public class Book implements Comparable{
    String name;
    int id;
    Book(String name,int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Book name : "+name+ " book id: "+id;
    }


    @Override
    public int compareTo(Object o) {
        Book b1=(Book)o;
        return this.name.compareTo(b1.name);
    }
    public boolean equals(Object o){
        Book b1=(Book) o;
        return this.name.equals(b1.name);
    }

}
