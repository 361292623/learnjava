package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 需求：利用输出流输出数据(响应体)到浏览器
@WebServlet(urlPatterns = "/demo02")
public class Demo02TwoServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置打印流编码：使用指定编码对数据进行编码
        // 注意事项：设置编码的方法必须在获取输出流对象之前执行
        // response.setCharacterEncoding("utf-8");

        // 设置响应头：content-type 告诉浏览器服务器返回数据的类型和使用编码
        // 该行代码实现两个功能：1：设置打印流的编码 2.告诉浏览器使用指定编码解析内容
        // response.setHeader("content-type", "text/html;charset=utf-8");
        response.setContentType("text/html;charset=utf-8");

        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();

        out.write("hello world");
        out.write("你好 师姐");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
