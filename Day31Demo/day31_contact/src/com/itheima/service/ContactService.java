package com.itheima.service;

import com.itheima.bean.User;
import com.itheima.dao.ContactDao;

import java.util.List;

/**
    业务层
 */
public class ContactService {
   // 数据访问层对象
    private ContactDao contactDao = new ContactDao();

    // 查询所有联系人返回
    public List<User> findAll(){
        return contactDao.findAll();
    }

}
