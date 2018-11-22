package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
    处理登录逻辑的Servlet

    步骤分析

        CodeServlet实现
            * 将验证码拼接成字符串存储到会话域中

        * 接收用户名和密码，验证码
        * 判断验证码是否正确
        * 如果验证码正确，则判断用户名和密码是否正确：username=admin password=123
            * 如果用户名和密码正确，则跳转欢迎页面
            * 如果用户名和密码不正确，则提示错误，3秒后跳转到登录页面
        * 如果验证码不正确，则提示验证错误，3秒后跳转到登录页面
 */
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  接收用户名和密码，验证码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 用户输入的
        String code = request.getParameter("code");

         HttpSession session = request.getSession();
        //  从会话域中取出验证码
        // verCode：服务器保存
        String verCode = (String) session.getAttribute("code");
        //  判断验证码是否正确
        if (verCode.equalsIgnoreCase(code)) {
            //  如果验证码正确，则判断用户名和密码是否正确：username=admin password=123
            if ("admin".equals(username) && "123".equals(password)) {
                // 往请求域中存储数据
                session.setAttribute("username", username);
                //  如果用户名和密码正确，则跳转欢迎页面
                request.getRequestDispatcher("welcome").forward(request, response);
                return;
            }
        }
        //  如果验证码不正确，则提示验证错误，3秒后跳转到登录页面
        response.sendRedirect(request.getContextPath()+"/fail");
    }
}
