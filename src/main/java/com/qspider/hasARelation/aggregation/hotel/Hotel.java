package com.qspider.hasARelation.aggregation.hotel;

public class Hotel {
    private String hName;
    private String branch;
    private String orderF1;
    private String orderF2;
    private String orderF3;

    public Hotel(String hName, String branch, String orderF1, String orderF2, String orderF3) {
        this.hName = hName;
        this.branch = branch;
        this.orderF1 = orderF1;
        this.orderF2 = orderF2;
        this.orderF3 = orderF3;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getOrderF1() {
        return orderF1;
    }

    public void setOrderF1(String orderF1) {
        this.orderF1 = orderF1;
    }

    public String getOrderF2() {
        return orderF2;
    }

    public void setOrderF2(String orderF2) {
        this.orderF2 = orderF2;
    }

    public String getOrderF3() {
        return orderF3;
    }

    public void setOrderF3(String orderF3) {
        this.orderF3 = orderF3;
    }
}
