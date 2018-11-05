package com.itheima._02jdbc概述;

/**
 1.客户端操作MySQL数据库的方式：
    * 命名行窗口
    * 图形化软件：SQLyog,Navicat
    * 通过Java代码操作数据库

 2.什么是JDBC：
    英文全称：Java DataBase Connectivity
    中文全称：Java 数据库连接技术

 3.JDBC的作用
    * 与数据库建立连接并对数据库执行增删改查操作。

 4.JDBC的好处：
    * 代码不依赖任何一个厂商的数据库
    * 只需要修改少量的代码就可以访问其他厂商的数据库

 5. JDBC核心API概述
     * Driver    接口  驱动对象
    * DriverManager 工具类  用来注册和管理驱动，用来获得连接对象。
    * Connection 接口 连接对象，用来和数据库建立连接
    * Statement  接口 SQL语句发送对象  用来将SQL语句发送给数据库执行并获得结果。
    * ResultSet  接口 结果集对象  用来封装满足查询条件的记录信息。
 */
public class JDBCDemo01 {

}
