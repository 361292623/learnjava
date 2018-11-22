package com.itheima._06session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

/**
 需求：Session对象常用方法
 */
@WebServlet(urlPatterns = "/session03")
public class Demo01SessionServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();
        // 创建session对象
        HttpSession session = req.getSession();
        // 获得会话ID：长度32二位的字符串
        out.println("会话ID:" + session.getId()+"<br>");
        out.println("会话创建时间:" + new Timestamp(session.getCreationTime()) + "<br>");
        out.println("上次访问时间:" + new Timestamp(session.getLastAccessedTime()) + "<br>");
        out.println("是否是新的会话：" + session.isNew() + "<br>");
        out.println("上下文对象:" + session.getServletContext() + "<br>");
    }
}
