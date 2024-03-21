package com.qspider.j2ee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecordIntoEmployee {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Step1");

            String url="jdbc:postgresql://localhost:5432/postgres?user=postgres&password=root";

            Connection connection= DriverManager.getConnection(url);
            System.out.println("Step2");

            Statement stmt=connection.createStatement();
            System.out.println("Step3");

            String query="delete from j2ee.emplyee where mobile=12345";

            int num=stmt.executeUpdate(query);
            System.out.println(num);

            if (num==0)
            {
                System.out.println("invalid no.");
            }

            connection.close();
            System.out.println("step6");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
