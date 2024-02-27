package com.qspider.program.loop;

import java.util.Scanner;

//write the java program to check weather the number is xylem number or phloem number
// the sum or first and last digit is similar to the sum of mid digit is call xylem number
//Ex:65212:-
//phloem :-the sum of first and last digit sum of not similar to midle digit is called as phloem number;
public class XylemPhloem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt(),temp=n;
        int mid=0,sf=0;
        int l=temp%10; // take the last digit
        temp=temp/10; // remove the last digit so that the num is left out with first and mid digit
        while (temp>9){
            int rem=temp%10;
            mid=mid+rem;
            temp=temp/10;
        }
        sf=l+temp;
        if(sf==mid){
            System.out.println(n+" number isi8 xylem number");
        }else {
            System.out.println(n+" number is phloem number");
        }
    }
}
