package com.itheima._06session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

// 需求：在一个 SetServlet 中，向Session 中添加一件商品名：洗衣机，
@WebServlet(urlPatterns = "/session01")
public class SetSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();

        // 创建session对象：当session不存在时创建：会话ID
        HttpSession session = req.getSession();
        // 调用setAttribute方法存储数据
        session.setAttribute("product", "洗衣机");

        out.println("往session中存储了一个产品");

    }
}
