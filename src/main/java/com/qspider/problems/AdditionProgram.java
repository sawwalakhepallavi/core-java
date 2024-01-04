package com.qspider.problems;

public class AdditionProgram {
    static  int i;
    static double j=5.6;
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println(i);
        System.out.println(j);
        add();
        System.out.println("main end");
    }
    public static void add(){
        int a=3;
        int b=5;
        int c=a+b;
        System.out.println("addition of static variable & initializer "+(i+j));
        System.out.println(" addition is :- "+c);

    }
    public static void sub()
    {

    }
}
