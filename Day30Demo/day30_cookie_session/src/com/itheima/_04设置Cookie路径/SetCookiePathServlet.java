package com.itheima._04设置Cookie路径;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 示例：创建一个Cookie，设置过期时间，设置 Cookie 的访问路径
@WebServlet(urlPatterns = "/path")
public class SetCookiePathServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建Cookie对象：存储数据
        Cookie cookie = new Cookie("username", "rose");
        // 设置过期时间
        cookie.setMaxAge(600);
        // 设置cookie路径
        cookie.setPath("/day30/path");
        // 返回给浏览器
        resp.addCookie(cookie);
    }
}
