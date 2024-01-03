package com.qspider.array;

public class SumetionOfArray {
    public static void main(String[] args) {
        int arr[]={4,5,3,2,6};
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("submation is :" +sum);
    }
}
