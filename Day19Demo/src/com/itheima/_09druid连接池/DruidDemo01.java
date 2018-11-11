package com.itheima._09druid连接池;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
    druid连接池基本使用：配置文件

    配置文件注意事项
        * 文件名：xxx.properties
        * 位置：一般存储src文件夹下

    DruidDataSourceFactory类概述
        * 数据源工厂类：负责生产数据源对象(连接池对象)
 */
public class DruidDemo01 {
    public static void main(String[] args)throws Exception{
        // 创建属性集合
        Properties info = new Properties();
        // Class对象的方法：getResourceAsStream  默认加载资源文件是从src下加载
        // InputStream in = DruidDemo01.class.getResourceAsStream("/druid.properties");
        // 加载配置信息
        info.load(DruidDemo01.class.getResourceAsStream("/druid.properties"));
        System.out.println(info);
        // 创建连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(info);
        for (int i = 0; i < 11; i++) {
            // 获得连接对象
            Connection conn = ds.getConnection();
            System.out.println(i+"="+conn);
            if (i == 2) {
                // 关闭连接：放回池中
                conn.close();
            }
        }
    }
}
