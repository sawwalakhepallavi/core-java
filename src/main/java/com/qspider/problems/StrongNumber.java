package com.qspider.problems;

public class StrongNumber {
    public static void main(String[] args) {
        int n=145;
        int temp=n;
        int rem=0;
        int add=0;
        while(n!=0){
            int fact=1;
            rem=n%10;
            while(rem>=1){
                fact=fact*rem;
                rem--;
            }
            n=n/10;
            add=add+fact;
        }
        if(add==temp){
            System.out.println("number is Strong number");
        }else {
            System.out.println("not a strong number");
        }
    }
}
