package com.registerdemo.dao;

import com.registerdemo.entity.User;
import com.registerdemo.util.DataSourceUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
    数据访问层：对数据库执行增删改查操作
 */
public class UserDao {

    // 创建jdbcTemplate对象
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
    /*
     * 查询用户名是否存在，存在返回true，否则false
     */
    public User findUser(String username){
        // 执行查询操作
        // queryForObject:如果没有查询到数据会抛出异常
        try{
            return jdbcTemplate.queryForObject(
                    "select * from user where username = ?;",
                    new BeanPropertyRowMapper<>(User.class),username);
        } catch(Exception e){
            return null;
        }
    }

   /* public User findUser02(String username){
        // 执行查询操作
        // queryForObject:如果没有查询到数据会抛出异常
        try{
            return jdbcTemplate.queryForObject(
                    "select * from user where username = ?;",
                    new BeanPropertyRowMapper<>(User.class),username);
        } catch(Exception e){
            return null;
        }
    }*/

    /*
     * 保存用户信息，成功返回true，否则false
     */
    public boolean saveUser(User user){
        try{
            // 执行保存数据操作
            return jdbcTemplate.update("insert into user values(null,?,?);"
                    ,user.getUsername(),user.getPassword()) == 1;
        } catch(Exception e){
            return false;
        }
    }

}
