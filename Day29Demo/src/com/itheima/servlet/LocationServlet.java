package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
- 需求：使用 location 进行页面跳转
    - 302 的含义：表示要重定向
- 步骤
    - 创建 LocationServlet
    - 调用 setHeader，设置响应头：("location","http://www.itcast.cn")
    - 调用 setStatus，设置响应状态码 302
 */
@WebServlet(urlPatterns = "/location")
public class LocationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();


        // 重定向：该行代码等价下面两行代码
        response.sendRedirect("login.html");

        // 设置响应头：location
        /*response.setHeader("location", "http://ntlias3.boxuegu.com");
        // 设置状态码：302
        response.setStatus(302);*/

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
