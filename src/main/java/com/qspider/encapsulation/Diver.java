package com.qspider.encapsulation;

import java.util.Scanner;

public class Diver {
    public static void main(String[] args) {
        Bag bag=new Bag();
        Mobile mobile=new Mobile();
        Shirt shirt=new Shirt();
        Watch watch=new Watch();
        Scanner scanner=new Scanner(System.in);

        System.out.println("1.Bag");
        System.out.println("2.Mobile");
        System.out.println("3.Shirt");
        System.out.println("4.Watch");

        System.out.println("enter the Product");
        int product=scanner.nextInt();

        switch(product){
            case 1:
                Boolean k=true;
                boolean j=true;
                while (k==j){
                    System.out.println("1.are you want to print the details of Bag");
                    System.out.println("2.are you want to modify the details of Bag");
                    System.out.println("3.Go back");
                    System.out.println("Enter the option");
                    int b = scanner.nextInt();
                    if (b == 1) {
                        System.out.println(bag.getColor());
                        System.out.println(bag.getPrice());
                    }
                    else if (b == 2) {
                        System.out.println("update the details");
                        System.out.println("Enter the color");
                        String c = scanner.next();
                        System.out.println("Enter the price");
                        int p = scanner.nextInt();
                        bag.setColor(c);
                        bag.setPrice(p);
                        System.out.println("color is " + bag.getColor());
                        System.out.println("price is " + bag.getPrice());
                    }
                    else {
                        System.out.println(false);
                         j=false;

                    }
                }
                break;

            case 2:
                for(int i=0;i<2;i++) {
                    System.out.println("1.are you want to print the details of Mobile");
                    System.out.println("2.are you want to modify the details of Mobile");
                    System.out.println("Enter the option");
                    int m = scanner.nextInt();
                    if (m == 1) {
                        System.out.println(mobile.getColor());
                        System.out.println(mobile.getPrice());
                        System.out.println(mobile.getComp());
                    }
                    if (m == 2) {
                        System.out.println("update the details");
                        System.out.println("Enter the color");
                        String c = scanner.next();
                        System.out.println("Enter the price");
                        int p = scanner.nextInt();
                        System.out.println("Enter the comp");
                        String comp = scanner.next();
                        mobile.setColor(c);
                        mobile.setPrice(p);
                        mobile.setComp(comp);
                        System.out.println("color is" + mobile.getColor());
                        System.out.println("price is " + mobile.getPrice());
                        System.out.println("company is " + mobile.getComp());
                    }
                }
                break;

            case 3:
                for(int i=0;i<2;i++) {
                    System.out.println("1.are you want to print the details of Shirt");
                    System.out.println("2.are you want to modify the details of Shirt");
                    System.out.println("Enter the option");
                    int s = scanner.nextInt();
                    if (s == 1) {
                        System.out.println(shirt.getColor());
                        System.out.println(shirt.getPrice());
                        System.out.println(shirt.getSize());
                    }
                    if (s == 2) {
                        System.out.println("update the details");
                        System.out.println("Enter the color");
                        String c = scanner.next();
                        System.out.println("Enter the price");
                        int p = scanner.nextInt();
                        System.out.println("Enter the size");
                        String sz = scanner.next();
                        shirt.setColor(c);
                        shirt.setPrice(p);
                        shirt.setSize(sz);
                        System.out.println("color is" + shirt.getColor());
                        System.out.println("price is " + shirt.getPrice());
                        System.out.println("Size is " + shirt.getSize());
                    }
                }
                break;
            case 4:
                for(int i=0;i<2;i++) {
                    System.out.println("1.are you want to print the details of Watch");
                    System.out.println("2.are you want to modify the details of Watch");
                    System.out.println("Enter the option");
                    int w = scanner.nextInt();
                    if (w == 1) {
                        System.out.println(watch.getColor());
                        System.out.println(watch.getPrice());
                        System.out.println(watch.getComp());
                    }
                    if (w == 2) {
                        System.out.println("update the details");
                        System.out.println("Enter the color");
                        watch.setColor(scanner.next());
                        System.out.println("Enter the price");
                        watch.setPrice(scanner.nextInt());
                        System.out.println("Enter the comp");
                        watch.setComp(scanner.next());
                        System.out.println("color is" + watch.getColor());
                        System.out.println("price is " + watch.getPrice());
                        System.out.println("company is " + watch.getComp());
                    }
                }
                break;
            default:
                System.out.println("Plz select the valid item");
        }

    }
}
