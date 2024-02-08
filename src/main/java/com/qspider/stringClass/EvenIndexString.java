package com.qspider.stringClass;

import java.util.Scanner;

public class EvenIndexString {
//    write a java program to print all the characters which are present on even index in a string

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the word : ");
        String v=scanner.next();

        for(int i=0;i<v.length();i++){
            if(i%2==0){
                System.out.println(v.charAt(i));
            }
        }
    }

}
