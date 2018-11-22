package com.itheima._08设置session过期时间;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 设置会话过期时间
 示例：设置会话过期时间为10秒，输出会话ID和过期时间
 */
@WebServlet(urlPatterns = "/setTime")
public class SetSessionTimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();
        // 获得session对象
        HttpSession session = request.getSession();
        // 设置最大非活动间隔时间：秒
        session.setMaxInactiveInterval(20);

        out.println("会话ID：" + session.getId()+"<br>");
        out.println("最大非活动时间间隔：" + session.getMaxInactiveInterval()+"<br>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
