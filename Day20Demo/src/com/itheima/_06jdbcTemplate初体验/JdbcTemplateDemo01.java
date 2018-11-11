package com.itheima._06jdbcTemplate初体验;

import com.itheima._03数据源工具类.DataSourceUtil;
import org.springframework.jdbc.core.JdbcTemplate;

/**
    JdbcTemplate之DDL语句
        * 创建产品表：产品id，产品名称，产品价格

    JdbcTemplate使用步骤
        1. 创建JdbcTemplate对象，传入Druid连接池
        2. 调用execute、update、queryXxx等方法
 */
public class JdbcTemplateDemo01 {
    public static void main(String[] args){
        // 创建JdbcTemplate模板对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 执行SQL语句：创建产品表
        jdbcTemplate.execute("create table product(" +
                "id int primary key auto_increment," +
                "name varchar(20) not null unique," +
                "price double)");
    }
}
