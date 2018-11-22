package com.itheima._07保存会话ID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
     保存会话ID
     需求：实现浏览器关闭还可以再访问服务器上没有过期的信息。

     步骤分析
        * 获得session对象，通过session获得会话ID
        * 创建cookie对象
        * 存储会话Id到cookie
        * 设置cookie的有效期
        * 返回cookie给浏览器
 */
@WebServlet(urlPatterns = "/save")
public class SaveSessionIDServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();
        // 直接获得会话ID
        String sessionId = req.getSession().getId();
        //  创建cookie对象,存储会话Id到cookie
        Cookie cookie =  new Cookie("JSESSIONID",sessionId);
        //  设置cookie的有效期
        cookie.setMaxAge(600);
        //  返回cookie给浏览器
        response.addCookie(cookie);

        out.println("保存了会话ID到浏览器的cookie中");
    }
}
