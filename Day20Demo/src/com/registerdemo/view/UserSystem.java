package com.registerdemo.view;

import com.registerdemo.entity.User;
import com.registerdemo.serivce.UserService;

import java.util.Scanner;

/**
    表现层
     实现步骤分析
     数据访问层类
         * boolean findUser(String username);
         * 查询用户名是否存在，存在返回true，否则false
         * boolean saveUser(User user);
         * 保存用户信息，成功返回true，否则false

     业务逻辑层类
         * boolean isExist(String username);
         * 判断用户名是否存在，存在返回true，否则false
         * boolean register(User user);
         * 执行注册操作，注册成功返回true，否则false

     表现层类
         * 创建键盘录入对象
         * 提示用户输入注册信息
         * 提示输入用户名
         * 接收用户名
         * 创建业务类对象
         * 调用方法判断用户名是否存在
         * 如果存在，则提示用户重新输入用户名
         * 如果不存在，则执行下一步
         * 提示输入密码
         * 接收密码
         * 将用户名和密码封装成User对象
         * 调用业务类对象的注册方法注册得到结果
 */
public class UserSystem {
    public static void main(String[] args){
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 提示用户输入注册信息
        System.out.println("-- 欢迎使用 --");
        System.out.println("请输入注册信息:");
        // 提示输入用户名
        System.out.println("用户名:");
        // 接收用户名
        String username = sc.nextLine(); // jack
        // 创建业务类对象
        UserService us = new UserService();
        // 调用方法判断用户名是否存在
        while (us.isExist(username)){
            System.out.println("用户名已经存在");
            // 如果存在，则提示用户重新输入用户名
            System.out.println("请输入注册信息:");
            // 提示输入用户名
            System.out.println("用户名:");
            // 接收用户名
            username = sc.nextLine(); // qqq
        }
        // 如果不存在，则执行下一步
        // 提示输入密码
        System.out.println("密码：");
        // 接收密码
        String password = sc.nextLine();
        // 将用户名和密码封装成User对象
        User user = new User(username,password);
        // 调用业务类对象的注册方法注册得到结果
        if (us.register(user)){
            System.out.println("注册成功");
        } else {
            System.out.println("注册失败");
        }

        User u = us.login(user);
        if (u!=null){
            System.out.println("登录成功");
        }

    }
}
