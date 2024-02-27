package com.qspider.program.loop;
// thw sum of power of each digits by its number of digits is similar to the actual number then it is known an amstrong number
//Ex:-153,1634...

public class AmstrongNumber {
    public static void main(String[] args) {
        int n=1634,temp=n,sum=0,digits=count(n);
        while (temp!=0){
            int last=temp%10;
            sum=sum+power(last,digits);
            temp=temp/10;
        }
        if(n==sum){
            System.out.println(n+ " Armstrong number");
        }else{
            System.out.println(n+" is not Armstrong number");
        }
    }
    public static int count(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int power(int m,int n){
        int power=1;
        for(int i=1;i<=n;i++){
            power=power*m;
        }
        return power;
    }
}
