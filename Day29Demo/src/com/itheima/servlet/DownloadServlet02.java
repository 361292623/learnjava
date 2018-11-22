package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 Servlet实现下载功能：中文存在乱码问题

 步骤
 1. 从链接上得到文件名
 2. 设置 content-disposition 头
 3. 得到文件的输入流
 4. 得到 response 的输出流
 5. 写出到浏览器端
 */
@WebServlet(urlPatterns = "/down02")
public class DownloadServlet02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 从链接上得到文件名
        String fileName = request.getParameter("filename");
        System.out.println(fileName);
        // 2. 设置 content-disposition 头
        response.setHeader("Content-Disposition", "attachment;filename="+fileName);
        // 3. 得到文件的输入流
        InputStream in = getServletContext().getResourceAsStream("/download/"+fileName);
        // 4. 得到 response 的输出流
        OutputStream out = response.getOutputStream();
        // 5. 写出到浏览器端

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
}
