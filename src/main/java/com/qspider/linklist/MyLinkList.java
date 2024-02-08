package com.qspider.linklist;

public class MyLinkList {

    public void addList(int n){
        Node nd=new Node(n);
        Node head=nd;
        if(nd!=null){
            nd.next=nd;
        }else {

        }
    }
    public static void main(String[] args) {

        MyLinkList ml=new MyLinkList();

    }
}
