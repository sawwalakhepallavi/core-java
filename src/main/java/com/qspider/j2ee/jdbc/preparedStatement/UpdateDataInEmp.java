package com.qspider.j2ee.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDataInEmp {
    public static void main(String[] args) {


        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=root";
        String query = "update j2ee.emplyee set mobile=? , email=? where empid = 1";

        try {
            Class.forName(driver);
            Connection connect = DriverManager.getConnection(url);


            PreparedStatement pstmt = connect.prepareStatement(query);
            System.out.println("Platform Created ...");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Email to Update");
            String email = sc.next();

            System.out.println("Enter Mobile no. to update");
            int mobile = sc.nextInt();
            pstmt.setInt(1,mobile);
            pstmt.setString(2,email);

            int status = pstmt.executeUpdate();
            System.out.println("No. of record updated..."+status);

            connect.close();


        }
        catch (Exception e) {

            e.printStackTrace();
        }



    }
}
