package com.qspider.program.loop;

public class AlternatePrimeNumber {
    public static void main(String[] args) {
        int primeCount=0;
        for(int j=1;j<=100;j++){
            int n=j;
            int count=0;
            for(int i=2;i<=n/2;i++){
                if(n%i==0)
                    count++;
            }
            if(count==0){
                primeCount++;
                if(primeCount%2!=0){
                    System.out.println(n);
                }
            }

        }
    }
//    public static int isPrime(int n){
//        boolean prime=true;
//        for(int i=2;i<=n/2;i++){
//            if(n%i==0)
//                prime=false;
//            break;
//        }
//       return n;
//    }
}
