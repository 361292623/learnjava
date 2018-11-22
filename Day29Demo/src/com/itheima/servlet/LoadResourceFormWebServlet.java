package com.itheima.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

// 需求：读取WEB-INF文件夹下aaa.jpg图片显示在浏览器上
@WebServlet(urlPatterns = "/image")
public class LoadResourceFormWebServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 可选：设置响应内容格式
        response.setHeader("content-type","image/jpg");
        // 获得上下文对象
        ServletContext context = getServletContext();
        // 获得资源文件对应字节输入流：in
        InputStream in = context.getResourceAsStream("/WEB-INF/aaa.jpg");
        // 获得字节输出流对象
        ServletOutputStream out = response.getOutputStream();
        // 定义字节数组存储读取到的图片数据
        byte[] buf = new byte[1024];
        // 定义整型数据接收读取到的字节个数
        int len = -1;
        // 循环读写数据
        while ((len = in.read(buf)) !=-1){
            // 通过out将图片数据输出到浏览器
            out.write(buf, 0, len);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
