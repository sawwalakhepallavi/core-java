package com.qspider.logicalpgm;

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BuzzNumber buzzNumber=new BuzzNumber();
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        buzzNumber.buzz(num);
    }

    private void buzz(int num) {
        if(num%7==0){
            System.out.println("number is Buzz Number");
        }else{
            while (num!=0){
                int rem=num%10;
                if(rem==7){
                    System.out.println("number is Buzz Number");
                }else{
                    System.out.println("number is not Buzz number");
                }
                num=0;
            }
        }
    }
}
