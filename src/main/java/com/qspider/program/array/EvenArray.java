package com.qspider.program.array;

public class EvenArray {
    public static void main(String[] args) {
        int[] arr={2,4,3,5,1,7,5,8,5};
        for(int a:arr){
            if(a%2==0){
                System.out.println(a);
            }
        }
    }
}
