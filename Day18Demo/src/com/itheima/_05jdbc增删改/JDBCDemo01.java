package com.itheima._05jdbc增删改;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

/*
    Statement接口概述
        * SQL发送对象，负责将SQL语句发送数据库执行并获得执行结果。

    如何获得Statement对象
        * 通过调用连接对象的方法获得，该方法声明如下：
                Statement	createStatement() 获得SQL语句发送对象。

    Statement接口中常用的方法
        * boolean execute(String sql);  可以用来执行任意的SQL语句，一般用来执行DDL语句
        * int executeUpdate(String sql); 用来执行增删改语句，返回被影响的行数
        * ResultSet executeQuery(String sql);
            * 用来执行查询语句，将满足查询条件的记录封装的到结果集对象中返回

     关闭资源的注意事项
        * 先开后关：先创建后关闭
            * 开启顺序： Connection --> Statement --> ResultSet
            * 关闭顺序： ResultSet --> Statement --> Connection
 */
public class JDBCDemo01 {
    /*
   使用JDBC在MySQL的数据库中创建一张学生表
       1)	id 是主键，整数类型，自增长
       2)	name 是varchar(20)，非空
       3)	性别 是char类型
       4)	生日 是date类型
   */
    @Test
    public void testCeateTable()throws Exception{
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 与数据库建立获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        // 获得SQL语句发送对象
        Statement stmt = conn.createStatement();
        // 准备SQL语句
        String sql = "create table student(" +
                "id int primary key auto_increment," +
                "name varchar(20) not null," +
                "gender char(1)," +
                "birthday date);";
        // 执行SQL语句
        stmt.execute(sql);
        // 关闭资源
        stmt.close();
        conn.close();
    }

    // 插入数据
    @Test
    public void testInsert()throws Exception{
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        // 获得发送对象
        Statement stmt = conn.createStatement();
        // 准备SQL语句
        String sql = "insert into student(name,gender,birthday) values('小武','男','2010-02-20')" +
                ",('小苍','女','1999-09-20');";
        // 执行SQL语句获得结果
        int row = stmt.executeUpdate(sql);
        System.out.println("row = " + row);
        // 关闭资源
        stmt.close();
        conn.close();
    }

    // 修改数据：更新id=1的学生姓名和性别
    @Test
    public void testUpdate() throws Exception {
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        // 获得发送对象
        Statement stmt = conn.createStatement();
        // 准备SQL语句
        String sql = "update student set name = '小柔', gender='女' where id = 1;";
        // 执行更新语句
        int row = stmt.executeUpdate(sql);
        System.out.println("row = " + row);
        // 关闭资源
        stmt.close();
        conn.close();
    }

    // 删除数据：删除id为1学生
    @Test
    public void testDelete()throws Exception{
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        // 获得发送对象
        Statement stmt = conn.createStatement();
        // 准备SQL语句
        String sql = "delete from student where id = 1;";
        // 执行更新语句
        int row = stmt.executeUpdate(sql);
        System.out.println("row = " + row);
        // 关闭资源
        stmt.close();
        conn.close();
    }

}
