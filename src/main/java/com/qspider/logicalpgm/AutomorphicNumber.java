package com.qspider.logicalpgm;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        AutomorphicNumber automorphicNumber=new AutomorphicNumber();
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        automorphicNumber.autoNum(num);
    }

    private void autoNum(int num) {
        int sq=num*num;
        int rem=0;
        while(sq!=0){
            rem=sq%10;
            sq=0;
        }
        if(rem==num){
            System.out.println("number is automorphic number");
        }else{
            System.out.println("number is not automorphic number");
        }
    }
}
