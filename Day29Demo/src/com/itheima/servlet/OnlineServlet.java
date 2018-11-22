package com.itheima.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/*
    需求：统计在线人数

    步骤分析
        1. 接收用户名和密码
        2. 判断用户名是否为admin和密码是否为123
        3. 如果是，则登录成功，
            * 先从上下文域中根据count获得当前在线人数
            * 如果count为null，则表示第一个登录，往上下文域中存储一个键值对：count:1
            * 如果count不为null，则获得count值加一，再存储到上下文域中：count：count+1
            * 则跳转到另一个页面：显示在线人数
       4. 如果不是，则登录失败，则提示用户名或密码错误，3秒都跳转登录页面
 */
@WebServlet(urlPatterns = "/online")
public class OnlineServlet extends HttpServlet {
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // 1. 接收用户名和密码
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       // 获得上下文域对象
       ServletContext context = getServletContext();
       // 2. 判断用户名是否为admin和密码是否为123
       if("admin".equals(username) && "123".equals(password)){
           // 3. 如果是，则登录成功，
           // 先从上下文域中根据count获得当前在线人数
           Integer count = (Integer)context.getAttribute("count");
           if (count == null) {
               // 如果count为null，则表示第一个登录
               count = 1;
           } else {
                // 如果count不为null，则获得count值加一
                count++;
           }
           // 存储count到上下文域中
           context.setAttribute("count", count);
           // 则跳转到另一个页面：显示在线人数
            request.getRequestDispatcher("count").forward(request, response);
       } else {
           // 4. 如果不是，则登录失败，则提示用户名或密码错误，3秒都跳转登录页面
           response.sendRedirect(request.getContextPath()+"/fail");
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
