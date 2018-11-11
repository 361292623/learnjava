package com.itheima._02SQL注入;

import java.sql.*;
import java.util.Scanner;

/**
    使用PreparedStatement接口解决SQL注入问题

    什么是SQL注入
        * 用户输入的内容和SQL语句进行拼接，部分内容作为了SQL语法的一部分改变的原有SQL语句的含义。

    如何解决SQL注入
        * 不要让用户输入的内容和SQL语句进行拼接，要使用PreparedStatement来发送SQL语句给数据库执行了。

    PreparedStatement接口概述
        * 继承 Statement
        * 表示预编译的 SQL 语句的对象。

    如何PreparedStatement对象
        * 通过调用连接对象的方法创建预编译对象，该方法声明如下
            *  PreparedStatement prepareStatement(String sql);

    PreparedStatement接口中常用的方法
        * int executeUpdate();
        * ResultSet executeQuery();

         void setDouble(int parameterIndex, double x)
         void setFloat(int parameterIndex, float x)
         void setInt(int parameterIndex, int x)
         void setLong(int parameterIndex, long x)
         void setString(int parameterIndex, String x)
            * 给占位符问号?赋值具体数据
            * parameterIndex：问号的索引，默认从1开始
            * x：需要赋的值

    PreparedStatement使用步骤
        * 准备SQL语句：未知内容使用占位符?代替
        * 根据SQL语句获得预编译对象
        * 给占位符?赋值具体的数据
        * 根据需求调用预编译对象的方法
            * int executeUpdate(); 执行增删改操作，返回被影响的行数
            * ResultSet executeQuery(); 执行查询操作，返回满足条件结果集对象。
        * 关闭资源

    Statement和PreparedStatement接口的区别(面试题)
        * PreparedStatement对象有预编译功能，Statement对象没有预编译功能。
        * PreparedStatement对象有缓存功能，Statement对象没有缓存功能。
        * PreparedStatement对象没有SQL注入问题，Statement对象有SQL注入问题。

    PreparedStatement接口的好处
        * 效率高：一条SQL语句多次运行只需要编译一次
        * 更安全：没有SQL注入
 sql = select * from user where username='jack' and password = 'a' or '1'='1'; drop database day19;';
 */
public class LoginDemo02 {
    public static void main(String[] args) throws SQLException {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 提示用户输入用户名
        System.out.println("请输入账号：");
        // 接收用户名
        String username = sc.nextLine();
        // 提示用户输入密码
        System.out.println("请输入密码：");
        // 接收密码
        String password = sc.nextLine();
        // 获得连接对象
        Connection conn = JDBCUtil.getConnection();

        // 准备SQL语句
        String sql = "select * from user where username= ? and password = ?;";


        // 获得预编译对象
        PreparedStatement ps = conn.prepareStatement(sql);

        // 给占位符?赋值具体的数据
        ps.setString(1, username);
        ps.setString(2, password);

        System.out.println("sql = " + sql);

        // 执行查询操作并获得结果集对象
        ResultSet rs = ps.executeQuery();
        // 根据结果集对象判断是否登录成功
        if (rs.next()){
            // 进来这里说明用户名和密码正确
            System.out.println("欢迎"+username+"回来");
        } else {
            System.out.println("用户名或密码错误");
        }
        // 关闭数据库资源
        JDBCUtil.close(rs, ps, conn);
    }
}
