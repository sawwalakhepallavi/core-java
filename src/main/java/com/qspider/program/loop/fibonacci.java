package com.qspider.program.loop;

public class fibonacci {
    public static void main(String[] args) {
        int n=10;//number of series
        int a=0;
        int b=1;
        if(n==1){
            System.out.println(a);
        }else if(n>1){
            System.out.println(a+"\n"+ b);
            for(int i=3;i<=n;i++){// already two series printed so start from 3rd series
                int c=a+b;// new series
                //getting ready for next series
                a=b;
                b=c;
                System.out.println(c);
            }
        }
        else {
            System.out.println("Enter valid number");
        }
    }
}
