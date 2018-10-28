package com.itheima._01Junit单元测试;
/*
* 登录功能
*
*
* */
public class LoginDemo02 {
    public static String login(String loginName , String passWord){
        // 校验是否正确
        if("admin".equals(loginName) && "003197".equals(passWord)){
            return "success"; // 登录成功
        }
        return "error";
    }

    public static void chu(int a , int b){
        System.out.println(a / b);
    }

    public void sing(){
        System.out.println("==sing===");
    }

    public void run(){
        System.out.println("==run===");
    }
}
