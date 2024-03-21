package com.qspider.j2ee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnection {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        System.out.println("step 1");

        String url="jdbc:postgresql://localhost:5432/postgres";
        String username="postgres";
        String password="root";
        Connection con= DriverManager.getConnection(url,username,password);
        System.out.println("step2");
        con.close();
    }
}
