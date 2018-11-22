package com.itheima._06session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

// 需求：从Session 中取出商品并输出在网页上。
@WebServlet(urlPatterns = "/session02")
public class GetSessionServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();
        // 获得session对象
        HttpSession session = req.getSession();
        // 从会话域获取数据
        Object product = session.getAttribute("product");
        // 将产品输出到网页上
        out.println("获得到的产品名称：" + product);
    }
}
