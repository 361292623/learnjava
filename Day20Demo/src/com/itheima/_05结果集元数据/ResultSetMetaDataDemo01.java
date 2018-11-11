package com.itheima._05结果集元数据;

import com.itheima._03数据源工具类.DataSourceUtil;

import java.sql.*;

/**
    1. ResultSetMetaData结果集元数据的作用
        * 用来获得列的数量
        * 用来获得每一列的名字
        * 用来获得每一列的数据类型

    2. 如何获得ResultSetMetaData对象
        * 通过ResultSet对方获得，方法声明如下：
            * ResultSetMetaData getMetaData()

    3. ResultSetMetaData接口常用方法
        * int getColumnCount() 获得列的数量
        * String getColumnName(int column)  获得指定列的名字
        * String getColumnTypeName(int column) 获得指定列的数据类型
 */
public class ResultSetMetaDataDemo01 {
    public static void main(String[] args) throws SQLException {
        // 获得连接对象
        Connection conn = DataSourceUtil.getConnection();
        // 获得预编译对象
        PreparedStatement ps = conn.prepareStatement("select id,name from student;");
        // 执行查询操作
        ResultSet rs = ps.executeQuery();

        // 获得结果集元数据对象
            ResultSetMetaData rmd = rs.getMetaData();
        // 获得列的数据
        int columnCount = rmd.getColumnCount();
        System.out.println(columnCount);
        // 遍历列输出名和数据类型
        for (int col = 1; col <= columnCount; col++) {
            // 根据列号获得列名
            String columnName = rmd.getColumnName(col);
            // 根据列号获得类型
            String columnTypeName = rmd.getColumnTypeName(col);
            System.out.println(columnName+"="+columnTypeName);
        }
        // 关闭资源
        DataSourceUtil.close(rs,ps ,conn);
    }
}
