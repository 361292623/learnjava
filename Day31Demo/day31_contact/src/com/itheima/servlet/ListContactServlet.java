package com.itheima.servlet;

import com.itheima.bean.User;
import com.itheima.service.ContactService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = "/list")
public class ListContactServlet  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建模型层对象：service
        ContactService cs = new ContactService();
        // 调用模型层的方法：service
        List<User> users = cs.findAll();
        // 将集合存储请求域中
        request.setAttribute("users",users);
        // 转发到list.jsp页面：显示联系人数据
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
