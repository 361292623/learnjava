package com.itheima._08jdbcTemplate执行DQL;

import com.itheima._03数据源工具类.DataSourceUtil;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
    jdbcTemplate执行DQL语句：将查询记录封装成自定义对象:Product

    rowMapper接口概述
        * 行映射器对象：将每一行记录封装成对象。

    BeanPropertyRowMapper类概述
        * 该类实现了rowMapper接口
        * Bean：JavaBean类 一个普通Java类，比如：Product，Student
        * entity：实体类
 */
public class JdbcTemplateDemo02 {

    // 查询所有产品封装成产品对象到List集合中
    @Test
    public void test01(){
        // 创建JdbcTemplate模板对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 执行查询操作
        // 参数1：要执行的SQL语句
        // 参数2：rowMapper
        List<Product> products =  jdbcTemplate.query("select * from product;", new RowMapper<Product>() {
            // 将记录转换为产品对象
            @Override
            public Product mapRow(ResultSet rs, int i) throws SQLException {
                // 获得列的值
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                // 创建产品对象
                Product product = new Product(id,name,price);
                // 返回产品对象
                return product;
            }
        });
        products.forEach(System.out::println);
    }


    // 查询所有产品封装成产品对象到List集合中
    @Test
    public void test02(){
    // 创建JdbcTemplate模板对象
    JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
    // 执行查询操作
    // 参数1：要执行的SQL语句
    // 参数2：rowMapper接口实现类对象
    List<Product> products =  jdbcTemplate.query(
            "select * from product;",
            new BeanPropertyRowMapper<>(Product.class));

    // Class c = Product.class
    // mapRow  ==> Product p = c.newInstance();
    // 结果集元数据对象获得每一列的名字,比如 name
    // Field f = c.getField(name); rs.get
    // f.set(p,)
    products.forEach(System.out::println);
    }

    // 根据id查询产品信息，得到一个产品对象
    @Test
    public void test03(){
        // 创建JdbcTemplate模板对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 执行查询操作
        // 参数1：要执行的SQL语句
        // 参数2：rowMapper接口实现类对象
        Product product =  jdbcTemplate.queryForObject(
                "select * from product where id = ?;",
                new BeanPropertyRowMapper<>(Product.class),2);
       System.out.println(product);
    }
}
