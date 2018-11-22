package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Base64;

/**
 Servlet实现下载功能：解决中文名乱码问题

 步骤
 1. 从链接上得到文件名
 2. 设置 content-disposition 头
 3. 得到文件的输入流
 4. 得到 response 的输出流
 5. 写出到浏览器端
 */
@WebServlet(urlPatterns = "/down")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 从链接上得到文件名
        String filename = request.getParameter("filename");
        // 3. 得到文件的输入流
        InputStream in = getServletContext().getResourceAsStream("/download/"+filename);

        // 获得请求头中的User-Agent
        String agent = request.getHeader("User-Agent");
        // 根据不同的客户端进行不同的编码
        if (agent.contains("MSIE")) {
            // IE浏览器
            filename = URLEncoder.encode(filename, "utf-8");
            filename = filename.replace("+", " ");
        } else if (agent.contains("Firefox")) {
            // 火狐浏览器
            filename = "=?utf-8?B?" + Base64.getEncoder().encodeToString(filename.getBytes("utf-8"))+"?=";
        } else if(agent.contains("Safari") && !agent.contains("Chrome")){
            // Safari浏览器：Chrome头也包含safari,需要排除Chrome
            byte[] bytesName = filename.getBytes("UTF-8");
            filename = new String(bytesName, "ISO-8859-1");
        } else {
            // Chrome以及其它浏览器
            filename = URLEncoder.encode(filename, "utf-8");
        }

        // 2. 设置 content-disposition 头
        response.setHeader("Content-Disposition", "attachment;filename="+ filename);

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
