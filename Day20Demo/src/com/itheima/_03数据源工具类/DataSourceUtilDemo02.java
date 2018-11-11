package com.itheima._03数据源工具类;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;

/**
 * 数据源工具类:优化后的代码
 */
public class DataSourceUtilDemo02 {
    // 添加数据
    @Test
    public void test01(){
        // 准备SQL语句
        String sql= "insert into student values(null,?,?,?);";
        // 执行SQL语句
        int row = DataSourceUtil.update(sql,"小武","女","2010-07-30");
        System.out.println(row);
    }

    // 更新数据
    @Test
    public void test02(){
        // 准备SQL语句
        String sql= "update student set name = ? where id = ?;";
        // 执行SQL语句
        int row = DataSourceUtil.update(sql,"小苍",3);
        System.out.println(row);
    }

    // 更新数据
    @Test
    public void test03(){
        // 准备SQL语句
        String sql= "delete from student where id = ?;";
        // 执行SQL语句
        int row = DataSourceUtil.update(sql,3);
        System.out.println(row);
    }
}