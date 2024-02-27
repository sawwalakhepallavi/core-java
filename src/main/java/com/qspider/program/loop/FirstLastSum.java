package com.qspider.program.loop;

import java.util.Scanner;

public class FirstLastSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int temp=n;
        int last=n%10;
        if(n>9) {
            while (temp>9) {
                temp/=10;
            }
            System.out.println(last+temp);
        }else {
            System.out.println(n);
        }
    }
}
