package com.qspider.program.stringprogram;

public class CountAlphaNumSC {
    public static void main(String[] args) {
        String s="M1T&*23aL**a(yT";
        int ACount=0,NCount=0,SCount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='z' || ch>='a' && ch<='z'){
                ACount++;
            } else if (ch>=48 && ch<=57) {
                NCount++;
            }else {
                SCount++;
            }
        }
        System.out.println("Alphabet Count:- "+ACount+"\nNumber Count:- "+NCount+"\nSpecial Character Count:- "+SCount);
    }
}
