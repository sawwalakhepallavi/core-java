package com.qspider.array;

public class OddArray {
    public static void main(String[] args) {
        int arr[]={2,67,5,98,90,76,2,6,79};
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println("odd number :"+arr[i]);
            }
        }
    }
}
