package com.qspider.problems;

public class SpyNumber {
    public static void main(String[] args) {
        int n=123;
        int add=0;
        int mul=1;
        int rem=0;
        while(n!=0){
            rem=n%10;
            add=add+rem;
            mul=mul*rem;
            n=n/10;
        }
        if(add==mul){
            System.out.println("the number is Spy number");
        }else {
            System.out.println("not a spy number");
        }
    }
}
