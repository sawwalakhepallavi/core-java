package com.qspider.logicalpgm;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CompositeNumber compositeNumber=new CompositeNumber();
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        compositeNumber.com(num);
    }

    private void com(int num) {
        int count=0;
        //153
        for(int i=1;i<=9;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count<3){
            System.out.println("number is not  Composite");
        }else{
            System.out.println("number is composite");
        }
    }
}
