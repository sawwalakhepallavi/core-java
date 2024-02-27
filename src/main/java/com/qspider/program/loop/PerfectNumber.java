package com.qspider.program.loop;

import java.util.Scanner;

// write a java program to check weather the number is perfect number or not
//if the sum of facter of the number similar to the actual number then it is known as perfect number
//Ex:-1+2+3=6
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n +" is perfect number");
        }else {
            System.out.println(n+" not a perfect number");
        }
    }
}
