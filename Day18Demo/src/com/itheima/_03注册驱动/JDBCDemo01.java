package com.itheima._03注册驱动;


import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.sql.DriverManager;

/**
    JDBC之注册驱动

    DriverManager与注册驱动相关的方法
        * static void registerDriver(Driver driver)
            * 注册驱动
            * driver：驱动对象
            * 存在问题：驱动会被注册两次

 */
public class JDBCDemo01 {


    // 注册驱动方式2：让驱动只注册一次
    @Test
    public  void test02()throws Exception {
        // 创建驱动对象
        // 类全名 ==> 包名.包名...类名
        Class.forName("com.mysql.jdbc.Driver");
    }


    // 注册驱动方式1：驱动会被注册两次
    @Test
    public  void test01()throws Exception{
        // 创建驱动对象
        Driver driver = new Driver();
        // 注册驱动
        DriverManager.registerDriver(driver);
    }
}
