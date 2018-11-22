package com.itheima._02获得上次访问时间;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Timestamp;

/*
  示例：得到用户上一次访问的时间并显示在网页上

  分析步骤
    1. 获得当前系统时间：2018-11-22 09:55:50
    2. 获得获得浏览器发送的所有cookie数据，得到Cookie数组
    3. 遍历Cookie数组，判断是否存在Visited键对应的cookie数据
    4. 如果存在，则表示上次已经有访问时间，获得上一次访问时间
    5. 再创建cookie对象，把当前时间返回给浏览器端
 */
@WebServlet(urlPatterns = "/visited")
public class LastVisitedTimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        // 设置内容的类型和编码格式
        response.setContentType("text/html;charset=utf-8");
        // 获得字符打印输出流对象
        PrintWriter out = response.getWriter();

        // 获得当前系统时间
        long currentTime = System.currentTimeMillis();
        // 创建时间戳对象
        Timestamp currentDate = new Timestamp(currentTime);
        // 获得浏览器发送所有的cookie数据
        Cookie[] cookies = req.getCookies();

        if (cookies != null){
            // 遍历数组
            for (Cookie cookie : cookies) {
                // 获得cookie名次
                String name = cookie.getName();
                // 判断name是否为：viisited
                if("visited".equals(name)){
                    // 获得上次访问时间：编码后的数据
                    String lastVisitedTime = cookie.getValue();
                    // 对上次访问时间进行URL解码
                    String decode = URLDecoder.decode(lastVisitedTime, "utf-8");
                    out.println("欢迎再次访问，您上次访问的时间是：" + decode +"<br>");
                    break;
                }
            }
        }
        // 对当前时间进行URL编码
        String encode = URLEncoder.encode(currentDate.toString(), "utf-8");
        // 输出当前访问时间
        out.println("这次访问时间是：" + currentDate);
        // 创建cookie对象：将当前时间存储到cookie中
        Cookie cookie = new Cookie("visited",encode);
        // 将cookie发送给浏览器端
        response.addCookie(cookie);
    }
}
