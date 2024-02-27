package com.qspider.program.loop;

public class ReversNumber {
    public static void main(String[] args) {
        int n=4536,temp=n;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Revers of "+temp+" is "+rev);
    }
}
//wajp to read an integer number from user and check weather the number is palindrome or not
//wajp to read an integer number from user and perform sum of fast & last digit
// wajp to print alphabet
