package com.itheima.dao;

import com.itheima.bean.User;
import com.itheima.utils.DataSourceUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
    数据访问层
 */
public class ContactDao {
    // jdbcTemplate模板对象
    JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtils.getDataSource());

    // 查询所有联系人对象
    public List<User> findAll(){
        // 如果查询不到数据不会出现异常，返回一个空集合
        return jdbcTemplate.query(
                "select * from contact;",
                new BeanPropertyRowMapper<>(User.class));
    }
}
