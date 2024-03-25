package com.qspider.j2ee.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");

            String query = "insert into j2ee.dept values(?,?)";


                //Create Prepared Statement platform

                PreparedStatement pstmt = con.prepareStatement(query);
                System.out.println("Platform Created..");

                //take input from user

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Dept No.");
                int deptno = sc.nextInt();

                System.out.println("Enter Dept Name ");
                String deptname = sc.next();

                //allocate the values

                pstmt.setInt(1, deptno);

                pstmt.setString(2,deptname);


                //Execution of Query

                int status = pstmt.executeUpdate();
                System.out.println("No. of row inserted : "+status);

                con.close();



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
