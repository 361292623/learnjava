package com.itheima._01cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
    需求：在Servlet中创建一个Cookie("User","pkxing")，并且写到浏览器端去
    Cookie的使用步骤
        * 创建Cookie对象，存储数据到Cookie中
	    * 将Cookie发送给客户端（浏览器）

	创建Cookie和发送Cookie相关的方法
	    * new Cookie("user","pkxing");
	        * 创建cookies
	    * response.addCookie(Cookie cookie)
	        * 将cookie添加到响应头中发送给浏览器
 */
@WebServlet(urlPatterns = "/demo01")
public class Demo01OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建Cookie对象
        Cookie cookie = new Cookie("user","pkxing");
        // 设置cookie的过期时间:单位秒
        cookie.setMaxAge(600);
        // 将cookie添加到响应头中发送给浏览器
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
