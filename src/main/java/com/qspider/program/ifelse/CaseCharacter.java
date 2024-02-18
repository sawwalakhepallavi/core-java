package com.qspider.program.ifelse;

import java.util.Scanner;

public class CaseCharacter {
    public static void main(String[] args) {
        // write a java program to read the number from the user and tell the character is upper case on lower case

        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println(ch+ " is the upper case alphabet ");
        } else if ( ch>='a' && ch<='z') {
            System.out.println(ch+" is the lower case alphabet");
        }else {
            System.out.println("plz enter valid character");
        }
    }
}
