package com.qspider.program.loop;

import java.util.Scanner;

public class ForRangePrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int num = i;
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            }
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
    }

}
//wajp to count the prime number between the range
//public static void main(String[] args) {
//  int primeCount=0;
//    for (int i = 1; i <= 100; i++) {
//        int num = i;
//        boolean isPrime = true;
//        if (num <= 1) {
//            isPrime = false;
//        }
//        for (int j = 2; j <= num / 2; j++) {
//            if (num % j == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            primeCount++;
//        }
//    }
//}