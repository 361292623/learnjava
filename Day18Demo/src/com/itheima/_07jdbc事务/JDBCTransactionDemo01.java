package com.itheima._07jdbc事务;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
    Connection对象与事务相关的方法
        * void setAutoCommit(boolean b);
            * 设置是否自动提交事务
            * b：true  自动提交事务 默认值
            * b：false 禁止自动提交，等价于 start transaction;
        * void commit(); 提交事务
        * void rollback(); 回滚事务
 */
public class JDBCTransactionDemo01 {
    // -- 创建账号表：账户编号,账户名称，账户余额
    @Test
    public void createTable() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        Statement stmt = conn.createStatement();
        int row = stmt.executeUpdate("create table account(" +
                "id int primary key auto_increment," +
                "name varchar(20) not null unique," +
                "balance double)");
        System.out.println("row = " + row);
        stmt.close();
        conn.close();
    }
    // -- 添加两个条数据
    @Test
    public void insert() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        Statement stmt = conn.createStatement();
        int row = stmt.executeUpdate("insert into account values(null,'jack',1000),(null,'rose',1000)");
        System.out.println("row = " + row);
        stmt.close();
        conn.close();
    }
}
