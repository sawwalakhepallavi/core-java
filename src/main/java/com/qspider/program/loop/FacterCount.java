package com.qspider.program.loop;

import java.util.Scanner;

//write the java program to count the facter of given number
public class FacterCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
