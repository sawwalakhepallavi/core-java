package com.qspider.logicalpgm;

import java.util.Scanner;

public class TwistedNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TwistedNumber twistedNumber=new TwistedNumber();
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        twistedNumber.twist(num);
    }

    private void twist(int num) {
        int count=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count<=2){
            System.out.println("Number is prime number");
            while(num!=0){
                int rem=num%10;
                int i=rem*10;
                num=num/10;
            }

        }else{
            System.out.println("Number is not prime number");
        }
    }
}
