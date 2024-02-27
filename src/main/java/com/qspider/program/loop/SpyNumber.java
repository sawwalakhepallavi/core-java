package com.qspider.program.loop;

public class SpyNumber {
    public static void main(String[] args) {
        int n=1124;
        int sum=0,mul=1;

        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            mul=mul*rem;
            n=n/10;
        }
        if(mul==sum){
            System.out.println(n+" is spy number");
        }else {
            System.out.println(n+" is not a spy number");
        }
    }
}
