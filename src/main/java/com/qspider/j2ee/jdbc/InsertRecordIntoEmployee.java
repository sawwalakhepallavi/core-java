package com.qspider.j2ee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecordIntoEmployee {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Step1");

            String url="jdbc:postgresql://localhost:5432/postgres?user=postgres&password=root";

            Connection connection=DriverManager.getConnection(url);
            System.out.println("Step2");

            Statement stmt=connection.createStatement();
            System.out.println("Step3");

            String query="insert into j2ee.emplyee values(3,'pk',4000,10 ,12345,'pk@gmail.com')";

            int num=stmt.executeUpdate(query);
            System.out.println(num);

            connection.close();
            System.out.println("step6");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
