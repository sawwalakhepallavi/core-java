package com.qspider.program.loop;

import java.util.Scanner;
//write the program to print the facter of given number
public class FactersOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
