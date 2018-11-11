package com.itheima._02SQL注入;

import java.sql.*;

/**
  JDBC工具类
 */
public class JDBCUtil {

    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/students";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    static {
        try {

            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            System.out.println("在这里？");
            e.printStackTrace();
        }
    }

/**
 *
 *获得连接对象
 *
*/
    public static Connection getConnection()  {
        try {
            return  DriverManager.getConnection(URL,USER, PASSWORD);
        } catch (Exception e) {
            // 抛出运行时异常
           throw new RuntimeException(e);
        }
    }


    // 关闭资源
    public static void close(Statement stmt, Connection conn){
        close(null, stmt, conn);
    }

    public static void close(ResultSet rs,Statement stmt, Connection conn){
        try {
            // 关闭资源
            if ( rs!= null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            // 关闭资源
            if (stmt != null)
                stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            // 关闭资源
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
