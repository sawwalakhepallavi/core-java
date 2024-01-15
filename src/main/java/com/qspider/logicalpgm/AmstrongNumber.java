package com.qspider.logicalpgm;

import java.util.Scanner;

public class AmstrongNumber {
    public void arm(int num){
        int nums=num;
        int n=num;
        int count=0;
        int sum=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);
        while(nums!=0){
            int rem=nums%10;
            int mul=1;
            for(int i=0;i<count;i++){
                 mul=rem*mul;
            }
            sum=mul+sum;
            nums=nums/10;
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println("number is amstrong...!");
        }else{
            System.out.println("not ....!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        AmstrongNumber amstrongNumber=new AmstrongNumber();
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        amstrongNumber.arm(num);
    }
}
