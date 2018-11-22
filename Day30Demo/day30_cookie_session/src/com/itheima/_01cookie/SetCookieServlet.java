package com.itheima._01cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 需求：一个往浏览器写入cookie
 */
@WebServlet(urlPatterns = "/set")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();
        // 创建Cookie对象
        Cookie cookie = new Cookie("name", "jack");
        // 将cookie发送给浏览器端
        response.addCookie(cookie);

        out.println("返回了一个cookie给浏览器端");
    }
}
