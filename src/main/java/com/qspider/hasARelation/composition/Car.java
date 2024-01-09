package com.qspider.hasARelation.composition;

public class Car {
    String ccomp;
    double cprice;
    Engine e;

    public Car(String ccomp, double cprice,Engine e) {
        this.ccomp = ccomp;
        this.cprice = cprice;
        this.e=e;
    }
}
