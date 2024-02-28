package com.qspider.program.array;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,5,6,7,9,13,15,7,17};
        for(int a :arr){
            int n=a,count=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(n);
            }
        }
    }
}
