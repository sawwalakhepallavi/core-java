package com.qspider.j2ee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VerifyRecord {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");

            Statement stmt=con.createStatement();
            ResultSet rs =stmt.executeQuery("select * from j2ee.emplyee where empid=2");
            boolean status=rs.next();
            System.out.println(status);

            if(status){
                System.out.println("valid employee id");
            }else {
                System.err.println("Invalid employee id");

            }


            con.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
