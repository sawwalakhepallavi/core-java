package com.qspider.stringClass;

public class ReversOfString {
    public static void main(String[] args) {
        String s1="apple";
        String rev="";

//        for(int i=0;i<s1.length();i++){
//            System.out.println(s1.charAt(i));
//        }

        for(int i=s1.length()-1;i>=0;i--){
            rev=rev+s1.charAt(i);
        }
        System.out.println(" reverse is : "+rev);

    }
}
