package com.itheima._05删除Cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


// 删除cookies
@WebServlet(urlPatterns = "/delete")
public class DelateCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建Cookie对象
        Cookie cookie = new Cookie("visited","");
        // 设置有效期为0
        cookie.setMaxAge(0);
        // 设置访问路径
        cookie.setPath(request.getContextPath());
        // 将cookie返回给浏览器端
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
