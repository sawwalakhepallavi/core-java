package com.qspider.calculator;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        Scanner sc =new Scanner(System.in);
        System.out.println("1.addition");
        System.out.println("2.substraction");
        System.out.println("3.multiplication");
        System.out.println("4.Division");
        int c=sc.nextInt();
        System.out.println("Enter the operation:-" +c);
        int d=sc.nextInt();
        int e=sc.nextInt();
        System.out.println("Enter the number one :- " +d);
        System.out.println("Enter the number two :- " +e);
        switch (c)
        {
            case 1:
                cal.add(d,e);
                break;
            case 2:
                cal.sub(d,e);
                break;
            case 3:
                cal.mul(d,e);
                break;
            case 4:
                cal.div(d,e);
                break;
            default:
                System.out.println("plz Enter valid value");

        }

    }
}
