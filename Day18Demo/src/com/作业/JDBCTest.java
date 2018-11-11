package com.作业;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stu_tea_cour"
                ,"root","root");

        System.out.println(conn);
        Statement stmt = conn.createStatement();
        ResultSet rs =  stmt.executeQuery("select * from student");
        while (rs.next()){
        String sno = rs.getString("sno");
        String sname= rs.getString("sname");
        System.out.println(sno+"->"+sname);

        }
        stmt.close();
        conn.close();
    }
}
