package com.qspider.program.array;

import java.util.Scanner;

public class ArmstrongArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();

        int[] arr=new int[size];

        for(int i=0;i<= arr.length-1;i++){
            System.out.println("Enter the element :");
            arr[i]=sc.nextInt();
        }

        for(int a:arr){
            int n=a,temp=n,sum=0,digits=count(n);
            while (temp!=0){
                int last=temp%10;
                sum=sum+power(last,digits);
                temp=temp/10;
            }
            if(n==sum){
                System.out.println(n+ " Armstrong number");
            }
        }

    }
    public static int count(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int power(int m,int n){
        int power=1;
        for(int i=1;i<=n;i++){
            power=power*m;
        }
        return power;
    }
}
