package com.qspider.program.loop;

public class OddDigit {
    public static void main(String[] args) {
        int n=2761,temp=n;
        while(temp!=0){
            int last =temp%10;
            if(last%2!=0){
                System.out.println(last);
            }
            temp/=10;
        }
    }
}
