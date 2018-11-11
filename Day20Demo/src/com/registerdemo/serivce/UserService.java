package com.registerdemo.serivce;

import com.registerdemo.dao.UserDao;
import com.registerdemo.entity.User;

/**
    业务层类
 */
public class UserService {

    // 创建数据访问层对象
    private UserDao userDao = new UserDao();

    /*
     * 判断用户名是否存在，存在返回true，否则false
     */
     public boolean isExist(String username){
        return userDao.findUser(username) != null;
     }

     /*
      * 执行注册操作，注册成功返回true，否则false
      */
     public boolean register(User user){
         return userDao.saveUser(user);
     }


     /*
        执行登录操作
      */
     public User login(User user) { // [username = 'jack',password='rose']
         // 根据用户名查询数据
         // [username = 'jack',password='rose']
         User u = userDao.findUser(user.getUsername());
         // 判断u是否不为空
         if (u != null) {
             // 判断密码是否正确
             if (user.getPassword().equals(u.getPassword())){
                return u;
             }
         }
         return null;
     }
}
