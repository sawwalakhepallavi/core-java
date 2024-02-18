package com.qspider.program.ifelse;


import java.util.Scanner;

// write the program to read the character to the user and print the formate of a character
public class FindCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        if(ch>='0' && ch<='9'){
            System.out.println(ch+ " is the number ");
        } else if (ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
            System.out.println(ch+" is alphabet");
        }else{
            System.out.println(ch+ " is a special character");
        }
    }
}
