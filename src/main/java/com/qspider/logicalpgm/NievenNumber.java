package com.qspider.logicalpgm;

import java.util.Scanner;

public class NievenNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        NievenNumber nievenNumber=new NievenNumber();
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        nievenNumber.nieven(num);
    }

    private void nieven(int num) {
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(num%sum==0){
            System.out.println("number is Niven number");
        }else {
            System.out.println("number is not Niven");
        }
    }
}
