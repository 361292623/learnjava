package com.itheima.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/life")
public class LifeCycleServlet implements Servlet {
    // 不要在servlet中定义成员变量，存在线程安全
    // int count = 100;

    // 构造方法
    public LifeCycleServlet(){
        System.out.println("执行构造方法.....");
    }

    // 初始化方法：只会执行一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("执行init初始化操作....");
    }

    // 不是生命周期的方法
    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig");
        return null;
    }

    // 每次请求都会调用1次
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println(response+"处理service请求方式..."+request);
    }


    // 不是生命周期的方法
    @Override
    public String getServletInfo() {
        System.out.println("返回一个字符");
        return null;
    }

    // 销毁方法：释放资源：只会执行一次，web容器关闭时销毁
    @Override
    public void destroy() {
        System.out.println("destroy销毁Servlet..");
    }
}
