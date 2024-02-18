package com.qspider.program.loop;

import java.util.Scanner;

//to check the number prime number or not
// prime number has only two facter
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        boolean isPrime=true;
//        int count=0;
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                count++;
//            }
//        }
//        if(count==2){
//            System.out.println(n+" is prime number");
//        }else{
//            System.out.println(n+" number is not prime");
//        }




//        for(int i=2;i<=n/2;i++){
//            if(n%i==0){
//                count++;
//            }
//        }
//        if(count==0){
//            System.out.println(n+" is prime number");
//        }else{
//            System.out.println(n+" number is not prime");
//        }

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;// not a prime number
                break;//stop checking
            }
        }
        if(isPrime){
            System.out.println(n+" is prime number");
        }else{
            System.out.println(n+" number is not prime");
        }
    }
}
