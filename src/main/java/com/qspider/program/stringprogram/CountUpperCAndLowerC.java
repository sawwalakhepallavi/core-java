package com.qspider.program.stringprogram;

public class CountUpperCAndLowerC {
    public static void main(String[] args) {
        String s="SHEeLa";
        int UCount=0,LCount=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                UCount++;
            }else{
                LCount++;
            }
        }
        System.out.println("Upper Character Count is :- "+UCount+" \nLower Character Count is :- "+LCount);
    }
}
