package com.qspider.program.loop;
//sum of each digit of sq of numbers similar to the actual number then it is known neon number.
//ex:9=9*9=81=8+1=9
public class NeonNumber {
    public static void main(String[] args) {
        int n=6,sum=0;
        int sq=n*n;
        int temp=sq;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+rem;
            temp/=10;
        }
        if(sum==n){
            System.out.println(n+" is neon number");
        }else{
            System.out.println(n+" is not a neon number");
        }
    }
}
