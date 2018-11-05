package com.itheima._08jdbc工具类;

import org.junit.Test;

import java.sql.*;

/**
  JDBC工具类使用测试
 */
public class JDBCUtilDemo {
    // 删除员工：删除1号员工
    @Test
    public  void deleteEmployee() throws Exception {
        // 获得连接对象
        Connection conn = JDBCUtil.getConnection();
        // 获得发送对象
        Statement stmt = conn.createStatement();
        // 执行SQL
        int row = stmt.executeUpdate("delete from emp where id = 1;");
        System.out.println("row = " + row);
        // 关闭资源
        JDBCUtil.close(stmt, conn);
    }

    // 修改员工：将id为3的员工姓名和地址
    @Test
    public void updateEmployee() throws Exception {
        // 获得连接对象
        Connection conn = JDBCUtil.getConnection();
        // 获得发送对象
        Statement stmt = conn.createStatement();
        // 执行SQL
        int row = stmt.executeUpdate("update emp set name = 'lucy',address='东京' where id = 3;");
        System.out.println("row = " + row);
        // 关闭资源
        JDBCUtil.close(stmt, conn);
    }

    // 添加多个员工
    @Test
    public void addEmployee() throws Exception {
        // 获得连接对象
        Connection conn = JDBCUtil.getConnection();
        // 获得发送对象
        Statement stmt = conn.createStatement();
        // 执行SQL
        int row = stmt.executeUpdate("insert into emp values(null,'jack',20,'广州')" +
                ",(null,'rose',22,'东莞')" +
                ",(null,'lily',24,'惠州')");
        System.out.println("row = " + row);
        // 关闭资源
        JDBCUtil.close(stmt, conn);
    }

    /*
     创建员工表: 员工号，员工姓名，年龄，地址
    */
    @Test
    public void createTable() throws Exception {
        // 获得连接对象
        Connection conn = JDBCUtil.getConnection();
        // 获得发送对象
        Statement stmt = conn.createStatement();
        // 执行SQL
        int row = stmt.executeUpdate("create table emp(id int primary key auto_increment," +
                "name varchar(20) not null," +
                "age int," +
                "address varchar(20))");
        System.out.println("row = " + row);
        // 关闭资源
        JDBCUtil.close(stmt, conn);
    }

}
