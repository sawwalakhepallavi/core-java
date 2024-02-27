package com.qspider.program.loop;
//if the next number for the number is perfect sq is the sunny number.
//ex:-80-->sunny number
//80+1=81.....9sq

public class SunnyNumber {
    public static void main(String[] args) {
//        int n=64;
//        for(int i=1;true;i++){
//            if(i*i==n){
//                System.out.println(n+ "is sunny number");
//                return;
//            }else if(i*i>n){
//                System.out.println(n+"is not sunny number");
//            }
//        }

        int n=63;
        if(isRoot(n+1)){
            System.out.println(n+ " is sunny number");
        }else
            System.out.println(n+"is not sunny number");
    }

    private static boolean isRoot(int n) {
        for(int i=1;true;i++){
            if(i*i==n)
                return true;
            else if(i*i>n)
                return false;
        }
    }
}
