package com.qspider.program.ifelse;

import java.util.Scanner;

public class NumberCharacter {
    //read one character from the user
//character should be number
//double the number
//-----------test case
//5-->10
//4-->8
//ch='4
//ch*2-->'4'*2
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the character number : ");
        char ch=scanner.next().charAt(0);
        if(ch>='0' && ch<='9'){
            int a=(char)(ch-48);
            int b=a*2;
            System.out.println(b);
        }else {
            System.out.println("enter valid number");
        }
    }
}
