package com.qspider.program.loop;

public class EvenDigit {
    public static void main(String[] args) {
        int n=2761,temp=n;
        int sum=0;
        while(temp!=0){
            int last =temp%10;

            if(last%2==0){
                sum=sum+last;
                System.out.println(sum);
            }
            temp/=10;
        }
    }
}
