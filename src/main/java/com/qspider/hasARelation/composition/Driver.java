package com.qspider.hasARelation.composition;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the values");
        Car car=new Car(scanner.next(),scanner.nextDouble(),new Engine("pka",157668));
        System.out.println(" car company :-"+car.ccomp);
        System.out.println(" car price:- "+car.cprice);
        System.out.println("engine company:-"+car.e.ecomp);
        System.out.println("engine price:-"+car.e.eno);
    }
}
