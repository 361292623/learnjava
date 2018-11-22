package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*- 需求：过3秒跳转到另一个网站
  - 步骤
    - 创建 RefreshServlet
    - 调用 setHeader，设置响应头：("Refresh","3;url=http://www.itcast.cn")
    - 调用 setStatus，设置响应状态码 200(可选)。
 */
// Refresh:  1;url=/day29/hello.html(重点)
@WebServlet(urlPatterns = "/refresh")
public class RefreshServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();
        out.write("过3秒跳转到另一个网站");

        // 设置响应头：Refresh
        // 告诉浏览器在3秒后跳转到指定的网站
        response.setHeader("Refresh", "3;url=http://ntlias3.boxuegu.com");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
