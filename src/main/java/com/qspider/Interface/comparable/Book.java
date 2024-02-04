package com.qspider.Interface.comparable;

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
        Book b1=(Book) o;
        if(this.id>b1.id){
            return 9;
        }else if(this.id<b1.id){
            return -1;
        }else {
            return 0;
        }
    }

//    @Override
//    public int compareTo(Object o) {
//        Book b1=(Book)o;
//        return this.name.compareTo(b1.name);
//    }

}
