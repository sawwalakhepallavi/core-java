package com.qspider.program.stringprogram;

public class AddSpecificIndex {
    public static void main(String[] args) {
        String s="mango";
        char ch='y';
        int index=3;

        String temp="";
        for(int i=0;i<s.length();i++){
            char h=s.charAt(i);
            if(index==i){
                temp=temp+ch+h;
            }else {
                temp=temp+h;
            }
        }
        System.out.println(temp);
    }
}
