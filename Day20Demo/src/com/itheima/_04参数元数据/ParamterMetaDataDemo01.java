package com.itheima._04参数元数据;

import com.itheima._03数据源工具类.DataSourceUtil;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 1. ParameterMetaData对象的作用
     * 参数元数据对象
     * 用来获得占位符问号的个数
     * 用来获得占位符的数据类型

 2. 如何获取ParameterData对象
    * 通过PreparedStatement对象的方法获得，该方法声明如下
        ParameterData getParameterMetaData()

 3. ParameterData接口常用方法
    * int getParameterCount() 获得占位符?的个数
    * String getParameterTypeName(int param)  获得指定位置占位符问号的数据类型，返回字符串
 */
public class ParamterMetaDataDemo01 {
    public static void main(String[] args) throws SQLException {
        // 获得连接对象
        Connection conn = DataSourceUtil.getConnection();
        // 获得预编译对象
        PreparedStatement ps = conn.prepareStatement("insert into student values(null,?,?,?);");
        // 获得参数元数据对象
        ParameterMetaData pmd = ps.getParameterMetaData();

        // 获得占位符?数量
        int count = pmd.getParameterCount();
        System.out.println("count = " + count);

        for (int i = 1; i <= count; i++) {
            // 根据索引获得占位符的数据类型
            String type =  pmd.getParameterTypeName(i);
            System.out.println(i+"："+type);
        }

        // 设置占位符数据
        ps.setString(1, "老王");
        ps.setString(2, "男");
        ps.setString(3, "2001-07-30");
        // 执行SQL
        int row = ps.executeUpdate();
        System.out.println(row);
        // 关闭资源
        DataSourceUtil.close(ps,conn);
    }
}
