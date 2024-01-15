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

    private void happy(int num) {
        int sqsum=0;
        while (num!=0){
            int rem=num%10;
            int sq=rem*rem;
            sqsum=sq+sqsum;
            num=num/10;
        }
    }
}
