package com.registerdemo.test;

import com.registerdemo.dao.UserDao;
import com.registerdemo.entity.User;
import org.junit.Test;

/**
    测试类
 */
public class TestUserDao {

    @Test
    public void testFindUser(){
        // 创建业务类对象
        UserDao userDao = new UserDao();
        // 判断用户是否存在
        User b = userDao.findUser("laowang");
        System.out.println("b = " + b);
    }
}
