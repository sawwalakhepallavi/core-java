package com.qspider.array;

import java.util.Scanner;

public class CountArray {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element of array from user");
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                count++;
            }
        }
        System.out.println("total count is:"+count);
    }
}
