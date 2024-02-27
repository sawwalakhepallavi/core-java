package com.qspider.program.loop;
//wajp to check weather the number is automorphic number or not
//
public class AutomorphicNumber {
    public static void main(String[] args) {
        int n=11;
        int temp=n;
        int sq=n*n;
        while(temp!=0){
            if(temp%10!=sq%10) {
                System.out.println(n + " is not automorphic number");
                return;
            }
            temp/=10;
            sq/=10;
        }
        System.out.println(n+ "is automophic number");
    }
}
