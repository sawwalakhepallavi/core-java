package com.qspider.stringClass;

import java.util.Scanner;

public class PrimeIndexString {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the word : ");
        String v=scanner.next();

        for(int i=0;i<v.length();i++){
            for(int j=0;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count<=3){
                System.out.println(v.charAt(i));
            }
        }
    }
}
