package com.qspider.hasARelation.aggregation.user;

import java.util.Scanner;

public class WhatsApp {
    User u;
    Scanner scanner=new Scanner(System.in);
    public void login(User u){
        if(this.u==null){
            this.u=u;
            System.out.println("Login successfully....!");
        }else{
            System.out.println("Already logined...!");
        }

    }
}
