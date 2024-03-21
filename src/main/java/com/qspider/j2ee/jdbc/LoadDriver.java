package com.qspider.j2ee.jdbc;

public class LoadDriver {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Step1");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
