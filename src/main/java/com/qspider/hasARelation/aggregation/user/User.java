package com.qspider.hasARelation.aggregation.user;

public class User {
    private String uName;
    private long cNo;
    private int pswd;
    private  String status;

    public User(String uName, long cNo, int pswd, String status) {
        this.uName = uName;
        this.cNo = cNo;
        this.pswd = pswd;
        this.status = status;
    }

    public String getuName() {
        return uName;
    }

    public long getcNo() {
        return cNo;
    }

    public int getPswd() {
        return pswd;
    }

    public void setPswd(int pswd) {
        this.pswd = pswd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
