package com.qspider.program.array;

public class ReversArray {
    public static void main(String[] args) {
        int[] arr={675,986,43,23,54};
        for(int a:arr){
            int n=a,rev=0,temp=n;
            while(temp!=0){
                int last=temp%10;
                rev=rev*10+last;
                temp/=10;
            }
            System.out.println(rev);
        }
    }
}
