package com.itheima.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


// 登录失败页面
@WebServlet(urlPatterns = "/fail")
public class LoginFailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 显示用户名或密码错误
        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();
        out.write("用户名或密码错误...3秒后跳转到登录页面...");

        // 设置响应头：Refresh: 3;url=页面
        response.setHeader("Refresh", "3;url=login.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
