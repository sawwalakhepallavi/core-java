package com.qspider.program.array;

public class PerfectSquareNumber {
    public static void main(String[] args) {
        int[] arr = {456, 231, 764, 121, 49, 5};
        for(int a:arr){
            int n=a;
            for (int i = 1; true; i++){
                if(i*i==n){
                    System.out.println(n);
                    break;
                }else if (i*i>n) {
                    break;
                }
            }
        }
    }
}
