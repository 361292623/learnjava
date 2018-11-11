package com.作业;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilTest {
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:/127.0.0.1:3306/stu_tear_cour";
    private static final String USER= "root";
    private static final String PASSWORD= "root";
    static{
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //获取连接对象
    public static Connection DBConnectiong(){
        try {
            return DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
           throw new RuntimeException(e);
        }

    }

}
