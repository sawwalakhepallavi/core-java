package com.qspider.isARelation.inheritance.typeCasting.book;


import java.util.Scanner;

public class Cart {
    static Scanner scanner=new Scanner(System.in);
    Book book;
    public static void main(String[] args) {
        Cart cart=new Cart();
        boolean exit=true;
        while(exit){
            System.out.println("what u want to do : \n1. Add Book \n2. Remove Book \n3. Show book \n4. Check Cart \n5. Show total");
            System.out.println("Enter the choice : ");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:{
                    cart.addBook();
                }
                break;
                case 2:{
                    cart.removeBook();
                }
                break;
                case 3:{
                    cart.showBook();
                }
                break;
                case 4:{
                    cart.checkCart();
                }
                break;
                case 5:{
                    cart.showTotal();
                }
                case 6:{
                    exit=false;
                }
            }
        }
    }

    private void showTotal() {
        if(book!=null){
            if(book instanceof HarryPotter){
                HarryPotter harryPotter=(HarryPotter) book;
                int qua= harryPotter.getQuantity();
                System.out.println("Total amount is : "+harryPotter.getPrice()*qua);
            } else if (book instanceof RomeoJulet) {
                RomeoJulet romeoJulet=(RomeoJulet) book;
                int qua= romeoJulet.getQuantity();
                System.out.println("Total amount is : "+romeoJulet.getPrice()*qua);
            }else {
                TwoStates twoStates=(TwoStates) book;
                int qua= twoStates.getQuantity();
                System.out.println("Total amount is : "+twoStates.getPrice()*qua);
            }
        }else {
            System.out.println("get the book first");
        }
    }

    private void checkCart() {
       if(book!=null){
           System.out.println("Cart is not Empty");
       }else {
           System.out.println("cart is empty");
       }
    }

    private void showBook() {
        if(book!=null){
            if(book instanceof HarryPotter){
                HarryPotter harryPotter=(HarryPotter)book;
                System.out.println(harryPotter.getName());
                System.out.println(harryPotter.getAuthor());
                System.out.println(harryPotter.getPages());
            } else if (book instanceof RomeoJulet) {
                RomeoJulet romeoJulet=(RomeoJulet) book;
                System.out.println(romeoJulet.getName());
                System.out.println(romeoJulet.getAuthor());
                System.out.println(romeoJulet.getPages());
            }else {
                TwoStates twoStates=(TwoStates) book;
                System.out.println(twoStates.getName());
                System.out.println(twoStates.getAuthor());
                System.out.println(twoStates.getPages());
            }
        }else {
            System.out.println("No Book selected");
        }
    }

    public void addBook(){
        System.out.println("which book u want to add \n1. HarryPorter \n2. RomeoJulet \n3. TwoStates");
        System.out.println("select the book : ");
        int choice=scanner.nextInt();
        switch (choice){
            case 1: {
                System.out.println("Enter the quantity of book");
                int qua = scanner.nextInt();
                HarryPotter harryPotter = new HarryPotter(qua);
                book = harryPotter;
                System.out.println(book.getQuantity());
            }
                break;

            case 2: {
                System.out.println("Enter the quantity of book");
                int qua = scanner.nextInt();
                RomeoJulet romeoJulet = new RomeoJulet(qua);
                book = romeoJulet;
                System.out.println(book.getQuantity());
            }
                break;

            case 3: {
                System.out.println("Enter the quantity of book");
                int qua = scanner.nextInt();
                TwoStates twoStates = new TwoStates(qua);
                book = twoStates;
                System.out.println(book.getQuantity());
            }
                break;
        }

    }
    public void removeBook(){
        if(book!=null){
            book=null;
            System.out.println("Book is successfully empty");
        }else {
            System.out.println("Book is already empty");
        }
    }

}
