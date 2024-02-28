package com.qspider.program.array;

import java.util.Scanner;

public class InputFromUserArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size :");
        int size=sc.nextInt();

        int[] arr=new int[size];

        for(int i=0;i<= arr.length-1;i++){
            System.out.println("Enter the element :");
            arr[i]=sc.nextInt();
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}

// wajp to print the armstrong number from the array