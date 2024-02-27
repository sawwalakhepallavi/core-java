package com.qspider.program.loop;

public class RangebtTwoNumberPalindrome {
    public static void main(String[] args) {
        for(int i=0;i<=200;i++){
            int num=i,temp=num,rev=0;
            while (temp!=0){
                rev=rev*10+(temp%10);
                temp/=10;
            }
            if(rev==num){
                System.out.println(num);
            }
        }
    }
}
