package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
    退出页面
 */
@WebServlet(urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();

        out.println("你已经成功退出");
        // 直接销毁session
        request.getSession().invalidate();
    }
}
