package com.qspider.array;

public class DuplicatArray {
    public static void main(String[] args) {
        int arr[]={6,10,14,10,2,4,9,2};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("number is duplicate :"+arr[i]);
                }
            }
        }
    }
}
