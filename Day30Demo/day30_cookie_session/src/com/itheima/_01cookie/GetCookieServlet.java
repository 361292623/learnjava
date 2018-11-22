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
    示例：一个读取浏览器传递的cookie并显示页面上。

    HttpServletRequest与获得Cookie相关的方法
        * Cookie[] getCookies
 */
@WebServlet(urlPatterns = "/get")
public class GetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();

        // 获得浏览器端发送过来的所有cookie信息
        Cookie[] cookies = request.getCookies();

        // 判断cookies是否不为null
        if(cookies != null){
            // 遍历数组
            for (Cookie cookie : cookies) {
                // 获得键和值
                String name = cookie.getName();
                String value = cookie.getValue();

                // 输出到浏览器上显示
                out.println(name+":"+value+"<br>");
            }
        } else  {
            out.println("浏览器没有发送任何cookie数据");
        }
    }
}
