package com.qspider.hasARelation.aggregation;

import java.util.Scanner;

public class WBDriver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age");
        int ag=scanner.nextInt();
        System.out.println("Enter the Author name");
        String n=scanner.next();


        Writer writer=new Writer(ag,n);
        System.out.println("Are you want to create the Book ?");
        System.out.println("1.yes");
        System.out.println("2.No");
        int s= scanner.nextInt();
        if(1==s){
            System.out.println("Enter the pages");
            int p= scanner.nextInt();
            System.out.println("Enter the Book Name");
            String bn =scanner.next();
            writer.toPrint(new Book(p,bn));
        }else{
            System.out.println("Thank you !");
        }


    }
}
