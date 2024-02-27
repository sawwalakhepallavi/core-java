package com.qspider.program.loop;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp =n;
        int count=0;
        while(temp!=0){
            int last=temp%10;//take a last number
            System.out.println(last);
            count++ ;
            temp/=10;  //remove last digit
        }
        System.out.println(n+ " has " +count +" digits ");
    }
}
