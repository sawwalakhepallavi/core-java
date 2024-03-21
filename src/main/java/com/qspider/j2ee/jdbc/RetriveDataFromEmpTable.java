package com.qspider.j2ee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveDataFromEmpTable {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
            Statement stmt=con.createStatement();
            ResultSet rs =stmt.executeQuery("select * from j2ee.emplyee where empid=1");
            if(rs.next()){
                int id=rs.getInt("empid");
                String name=rs.getString("ename");
                int sal=rs.getInt("salary");
                System.out.println("id :-"+id+" , name:-"+name+" ,salary:-"+sal);
            }else {
                System.err.println("Invalid Employee Id");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
