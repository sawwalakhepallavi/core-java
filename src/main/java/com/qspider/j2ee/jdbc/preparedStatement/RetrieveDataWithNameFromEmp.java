package com.qspider.j2ee.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetrieveDataWithNameFromEmp {
    public static void main(String[] args) {


        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/j2ee?user=root&password=sql123";
        String query = "select * from emp where ename like %?%";


        try {
            Class.forName(driver);
            Connection connect = DriverManager.getConnection(url);


            PreparedStatement pstmt = connect.prepareStatement(query);
            System.out.println("Platform Created ...");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Charecter to get data ");
            String c = sc.next();

            pstmt.setString(1, c);

            ResultSet rs = pstmt.executeQuery();

            if(rs.isBeforeFirst())
            {
                while(rs.next())
                {
                    System.out.println("Emp name is : "+rs.getString(0));
                }
            }
            else
            {
                System.err.println("Invalid ");
            }




        }
        catch (Exception e) {
            e.printStackTrace();

        }


    }
}
