package com.itheima._06Properties属性集;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Scanner;

/*
* 需求: 系统只能孙悟空 003197
*
* */
public class PropertiesDemo02 {
    public static void main(String[] args) throws Exception {
        // 读属性文件
        Properties pro = new Properties();

        // 把属性文件的全部数据加载到集合pro中
        pro.load(new FileInputStream("src/users.properties"));

        Scanner san = new Scanner(System.in);
        System.out.print("请输入您的用户名：");
        String uName = san.next();
        System.out.print("请输入您的密码：");
        String pwd = san.next();

        if(uName.equals(pro.getProperty("userName"))
                  && pwd.equals(pro.getProperty("passWord"))){
            System.out.println("SUCCESS");
        }else{
            System.err.println("您的用户名或者密码错误了！请从新认证！");
        }

    }
}
