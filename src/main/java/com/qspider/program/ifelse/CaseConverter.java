package com.qspider.program.ifelse;

import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println((char)(ch+32));
        } else if (ch>='a' && ch<='z') {
            System.out.println((char)(ch-32));
        }else {
            System.out.println(ch+" is invalid");
        }
    }
}
//read one character from the user
//character should be number
//double the number
//-----------test case
//5-->10
//4-->8
//ch='4
//ch*2-->'4'*2