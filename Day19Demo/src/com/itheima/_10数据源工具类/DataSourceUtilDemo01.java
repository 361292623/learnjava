package com.itheima._10数据源工具类;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima._09druid连接池.DruidDemo01;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Properties;

/**
    数据源工具类测试
 */
public class DataSourceUtilDemo01 {
    public static void main(String[] args) throws SQLException {
        // 获得连接对象
        Connection conn = DataSourceUtil.getConnection();
        // 获得预编译对象
        PreparedStatement ps = conn.prepareStatement("insert into student values(null,?,?,?);");
        // 给占位符赋值
        ps.setString(1, "xxx");
        ps.setString(2, "女");
        ps.setString(3, "2010-02-20");
        // 执行SQL
        int row = ps.executeUpdate();
        System.out.println(row);

        // 关闭资源
        DataSourceUtil.close(ps,conn );
    }
}
