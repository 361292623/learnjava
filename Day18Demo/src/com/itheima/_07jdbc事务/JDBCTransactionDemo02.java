package com.itheima._07jdbc事务;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
    JDBC之事务管理：jack给rose转500块
 */
public class JDBCTransactionDemo02 {
   public static void main(String[] args){
       // 声明连接对象
       Connection conn = null;
       // 声明发送对象
       Statement stmt = null;
       try{
           // 获得连接对象
           conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");

           // 禁止自动提交事务：开启事务
           conn.setAutoCommit(false);
           // 获得发送对象
           stmt = conn.createStatement();
           // 准备扣钱SQL：jack扣500
           String sql01 = "update account set balance = balance - 500 where id = 1;";
           // 执行扣钱SQL
           int row = stmt.executeUpdate(sql01);
           System.out.println("row = " + row);

           // 模拟异常
           System.out.println(100/0);

           // 准备加钱SQL：rose加500
           String sql02 = "update account set balance = balance + 500 where id = 2;";
           // 执行加钱SQL
           row = stmt.executeUpdate(sql02);
           System.out.println("row = " + row);

           // 提交事务
           conn.commit();

       } catch(Exception e){
           try {
               System.out.println("回滚了事务....");
               // 回滚事务
               if (conn != null)
                   conn.rollback();
           } catch (SQLException e1) {
               e1.printStackTrace();
           }
       } finally {
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
}
