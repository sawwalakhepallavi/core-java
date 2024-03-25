package com.qspider.j2ee.jdbc;

import java.sql.*;

public class RetrieveSalFromEmp {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
            Statement stmt=con.createStatement();
            ResultSet rs =stmt.executeQuery("select * from j2ee.emplyee where salary>10000");
            Boolean status=rs.isBeforeFirst();

            if(status){
                while (rs.next()){
                    System.out.println("employee id:- "+rs.getInt("empid")+"\n employee name:- "+rs.getString("ename")
                    +"\nsalary of emp:- "+rs.getInt("salary"));
                }
            }else {
                System.err.println("No one is present...");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
//write a program to print emp details if emp id is prime number;
