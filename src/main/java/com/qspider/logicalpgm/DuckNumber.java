package com.qspider.logicalpgm;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DuckNumber duckNumber=new DuckNumber();
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        duckNumber.duck(num);
    }

    private void duck(int num) {
        int rem=0;
        int first=1;
        while(num!=0){
            rem=num%10;
            first=num/10;
            num=0;
        }
        if(rem==0 && first!=0 && num!=0){
            System.out.println("number is Duck Number");
        }else{
            System.out.println("number is not Duck number");
        }
    }
}
