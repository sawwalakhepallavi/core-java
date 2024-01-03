package com.qspider.array;

public class FactOfEven {
    public static void main(String[] args) {
        int arr[]={1,2,5,4,6};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                int fact=1;
                while(arr[i]!=0){
                    fact=fact*arr[i];
                    arr[i]--;
                }
                System.out.println("factorial is: " +fact);
            }
        }
    }
}
