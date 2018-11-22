package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**

 Servlet开发步骤
     1. 创建一个类，继承HttpServlet
        * HttpServlet已经实现了Servlet接口
     2. 重写doGet或doPost
        * 在方法中接收请求并响应数据。

     3. 配置Servlet程序

     4. 将应用程序部署到Web服务器中
 */
public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       System.out.println("接收到了请求...");
        // 设置内容的类型和编码格式
       response.setContentType("text/html;charset=utf-8");
       // 获得字符打印输出流对象
       PrintWriter out = response.getWriter();
       // 往浏览器输出内容
        out.write("<h1>Hello Servlet</h1>");
    }
}
