package com.qspider.program.loop;
//the sum of factorial of each digit is similar to the actual number then it is known as strong number Ex:- 145
public class StrongNumber {
    public static void main(String[] args) {
        int n=145,temp=n;
        int sum=0;
        while(temp!=0){
            int last=temp%10;
            sum=sum+factorial(last);
            temp=temp/10;
        }
        if(sum==n){
            System.out.println(n+" is Strong number");
        }else{
            System.out.println(n+" is not Strong number");
        }
    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
