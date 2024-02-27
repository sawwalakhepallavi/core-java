package com.qspider.collection.arraylist.swiggy;

public class Hotel {
    public String hname;
    public String order;
    public int quantity;

    public Hotel(String hname, String order, int quantity) {
        this.hname = hname;
        this.order = order;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hname='" + hname + '\'' +
                ", order='" + order + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
