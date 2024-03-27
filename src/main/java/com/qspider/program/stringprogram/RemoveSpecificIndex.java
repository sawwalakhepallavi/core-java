package com.qspider.program.stringprogram;

public class RemoveSpecificIndex {
    public static void main(String[] args) {
        String s="mango";
        int index=3;
        String temp=" ";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(index==i){
                temp=temp+"";
            }else{
                temp=temp+ch;
            }
        }
        System.out.println(temp);
    }
}
