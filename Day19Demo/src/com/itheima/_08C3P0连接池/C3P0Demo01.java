package com.itheima._08C3P0连接池;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
    C3P0连接池基本使用之配置文件方式

    配置文件的要求
        * 位置要求：配置文件要存储在src文件夹
        * 命名要求：c3p0-config.xml

    配置文件的使用方式
        * 默认配置
        * 命名配置
 */
public class C3P0Demo01 {
    public static void main(String[] args) throws SQLException {
        // 创建连接池对象：使用默认配置
        ComboPooledDataSource ds = new ComboPooledDataSource();
        for (int i = 0; i < 11; i++) {
            // 获得连接对象
            Connection conn = ds.getConnection();
            System.out.println(i+"="+conn);
            if (i == 5) {
                // 关闭连接对象：将连接对象放回池中
                conn.close();
            }
        }
    }
}
