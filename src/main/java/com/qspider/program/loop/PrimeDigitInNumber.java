package com.qspider.program.loop;

public class PrimeDigitInNumber {
    public static void main(String[] args) {
        int n=57436,temp=n;
        while(temp!=0){
            int last=temp%10;
            if(isPrime(last)){
                System.out.println(last);
            }
            temp/=10;
        }
    }

    private static boolean isPrime(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2)
            return true;
        else
            return false;
    }
}
