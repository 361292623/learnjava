package com.itheima._04建立连接;


import com.mysql.jdbc.Driver;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
    JDBC之与数据库建立连接

    DriverManager类获得连接对象的相关方法
        * static Connection	getConnection(String url, String user, String password)
            * 与数据库建立连接并获得连接对象
            * url：数据库连接字符串
            * user：用户名 比如：root
            * password：密码 比如：root

        * static Connection	getConnection(String url, Properties info)
            * 与数据库建立连接并获得连接对象
            * url：数据库连接字符串
            * info：属性集合，用来存储用户名和密码

    数据库连接字符串
        * JDBC协议:子协议://数据库服务器地址:端口号/数据库名
            * JDBC协议就是jdbc
            * 子协议：就是数据库厂商名称

    MySQL数据库连接字符串
        * jdbc:mysql://localhost:3306/day18
        * 简化写法： jdbc:mysql:///day18  前提：本机且端口号是默认端口号：3306
 */
public class JDBCDemo01 {
    public static void main(String[] args)throws Exception{
        // 注册驱动

        Class.forName("com.mysql.jdbc.Driver");
        // 方式1：获得连接对象
        // Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        // System.out.println(conn);


        //方式2：获得连接对象
        // 创建属性集合对象
        Properties info = new Properties();
        // 创建字节输入流关联目标文件
        FileInputStream fis = new FileInputStream("Day18Demo/src/jdbc.properties");
        // 从配置文件中加载信息到集合中
        info.load(fis);
        // 关闭流
        fis.close();
        System.out.println("info = " + info);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu_tea_cour", info);
        System.out.println(conn);
    }
}
