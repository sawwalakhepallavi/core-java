package com.qspider.hasARelation.aggregation.hotel;

public class Customer {
    private String name;
    private long contactNumber;
    private  String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customer(String name, long contactNumber, String city) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.city = city;
    }
}
