package com.itheima._07jdbcTemplate执行DML;

import com.itheima._03数据源工具类.DataSourceUtil;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/**
    JdbcTemplate之执行DML：data manipulation language
 */
public class JdbcTemplateDemo01 {

    // 添加数据
    @Test
    public void insert(){
        // 创建JdbcTemplate模板对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 准备SQL
        String sql = "insert into product values(null,?,?);";
        // 添加产品信息
        jdbcTemplate.update(sql,"Iphone6p",3500);
        jdbcTemplate.update(sql,"Iphone7p",4500);
        jdbcTemplate.update(sql,"Iphone X",8500);
        jdbcTemplate.update(sql,"Iphone XS Max",12500);
        jdbcTemplate.update(sql,"Iphone8s",4000);
    }

    // JDBCTemplate修改数据
    @Test
    public  void test02() throws Exception {
        // 创建JdbcTemplate模板对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 准备SQL
        String sql = "update product set price = ? where id = ?;";
        // 执行SQL
        int row = jdbcTemplate.update(sql, 2500,1);
        System.out.println(row);
    }

    // JDBCTemplate删除数据
    @Test
    public  void test03() throws Exception {
        // 创建JdbcTemplate模板对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 执行SQL
        int row = jdbcTemplate.update("delete from product where id = ?;", 1);
        System.out.println(row);
    }
}
