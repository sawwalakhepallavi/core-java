package com.qspider.program.array;

import java.util.Scanner;
//to find the factorial in the array read input from user
public class FactorialArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size=sc.nextInt();

        int[] arr =new int[size];
        for(int i=0;i< arr.length;i++){
            System.out.println("Enter the Element : ");
            arr[i]=sc.nextInt();

            int fact=1;
            for(int j=1;j<=arr[i];j++){
                fact*=j;
            }
            System.out.println(arr[i]+" is factorial of "+fact);
        }



    }
}
