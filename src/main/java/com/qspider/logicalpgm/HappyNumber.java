package com.qspider.logicalpgm;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HappyNumber happyNumber=new HappyNumber();
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        happyNumber.happy(num);
    }

    private void happy(int num) {//32
        int n=num;
        do {
            int sqsum = 0;
            while (num != 0) {
                int rem = num % 10;
                int sq = rem * rem;
                sqsum = sq + sqsum;//13
                num = num / 10;
            }
            System.out.println(sqsum);
            num=sqsum;
        }while (num>9);
        if(num==1){
            System.out.println("Number is happy number : "+n);
        }else {
            System.out.println("not a happy number");
        }
    }
}
