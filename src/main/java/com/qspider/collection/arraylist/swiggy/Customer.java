package com.qspider.collection.arraylist.swiggy;

import java.util.Objects;

public class Customer {
    public int cus_Id;
    public String cname;
    public String city;
    public int con_No;

    public Customer(int cus_Id, String cname, String city, int con_No) {
        this.cus_Id = cus_Id;
        this.cname = cname;
        this.city = city;
        this.con_No = con_No;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cus_Id=" + cus_Id +
                ", cname='" + cname + '\'' +
                ", city='" + city + '\'' +
                ", con_No=" + con_No +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        Customer customer = (Customer) o;
//        return cus_Id == customer.cus_Id && con_No == customer.con_No && Objects.equals(cname, customer.cname) && Objects.equals(city, customer.city);
//    }

}
