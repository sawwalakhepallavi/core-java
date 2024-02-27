package com.qspider.program.loop;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        int n=2761,temp=n,ecount=0,ocount=0;
        while(temp!=0){
            int last=temp%10;
            if(last%2!=0){
                ocount++;
            }else{
                ecount++;
            }
        }
        System.out.println(n+ " has "+ecount+ " even number and "+ocount+" odd digit ");
    }
}
