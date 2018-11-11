package com.itheima._03数据源工具类;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Properties;

/**
 * 数据源工具类：存在大量重复代码
 */
public class DataSourceUtilDemo01 {
    // 添加数据
    @Test
    public void test01()throws Exception{
        // 获得连接对象
        Connection conn = DataSourceUtil.getConnection();
        // 准备SQL语句
        String sql= "insert into student values(null,?,?,?);";
        // 获得预编译对象
        PreparedStatement ps = conn.prepareStatement(sql);

        // 设置占位符数据
        ps.setString(1, "小武");
        ps.setString(2, "女");
        ps.setString(3, "2010-07-30");

        // 执行SQL
        int row = ps.executeUpdate();
        System.out.println(row);
        // 关闭资源
        DataSourceUtil.close(ps,conn);
    }

    // 更新数据
    @Test
    public void test02()throws Exception{
        // 获得连接对象
        Connection conn = DataSourceUtil.getConnection();
        // 准备SQL语句
        String sql= "update student set name = ? where id = ?;";
        // 获得预编译对象
        PreparedStatement ps = conn.prepareStatement(sql);
        // 设置占位符数据
        ps.setString(1, "小苍");
        ps.setInt(2, 2);
        // 执行SQL
        int row = ps.executeUpdate();
        System.out.println(row);
        // 关闭资源
        DataSourceUtil.close(ps,conn);
    }

    // 更新数据
    @Test
    public void test03()throws Exception{
        // 获得连接对象
        Connection conn = DataSourceUtil.getConnection();
        // 准备SQL语句
        String sql= "delete from student where id = ?;";
        // 获得预编译对象
        PreparedStatement ps = conn.prepareStatement(sql);
        // 设置占位符数据
        ps.setInt(1, 2);
        // 执行SQL
        int row = ps.executeUpdate();
        System.out.println(row);
        // 关闭资源
        DataSourceUtil.close(ps,conn);
    }
}