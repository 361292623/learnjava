package com.itheima.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

// 生成验证码的servlet
@WebServlet(urlPatterns = "/code")
public class CodeServlet extends HttpServlet{
    // 返回一个随机色对象
    public Color randomColor(){
        Random r = new Random();
        return new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 写一个方法随机获取颜色
        // 2. 创建缓存图片：指定宽width=90，高 height=30
        int width = 90;
        int height = 30;
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        // 3. 获取画笔对象
        Graphics g = image.getGraphics();
        // 4. 设置画笔颜色，并且填充矩形区域
        g.setColor(Color.white);
        // 填充矩形区域
        g.fillRect(0, 0, width, height);

        // 5. 从字符数组中随机得到字符
        char[] arr = { 'A', 'B', 'C', 'D', 'N', 'E', 'W', 'b', 'o', 'y', '1', '2', '3', '4'};

        // 创建可变字符串
        StringBuilder sb = new StringBuilder();
        // 创建随机数对象
        Random r = new Random();
        // 随机获得四个字符
        for (int i = 0; i < 4; i++) {
            // 获得随机数
            int index = r.nextInt(arr.length);
            // 获得要绘制的字符
            char c = arr[index];
            // 6. 设置字体，大小为 18，设置字的颜色随机
            g.setFont(new Font(Font.DIALOG,Font.BOLD+Font.ITALIC,18));

            // 设置字体颜色
            g.setColor(randomColor());

            // 7. 将每个字符画到图片上，位置：5+(i*20), 20
            g.drawString(String.valueOf(c), 5+(i*20), 20);

            // 拼接验证码字符
            sb.append(c);
        }

        // 获得session对象
        request.getSession().setAttribute("code", sb.toString());

        // 8. 画10条干扰线，线的位置是随机的，x 范围在 width 之中，y 的范围在 height 之中。
        for (int i = 0; i < 10; i++) {
            // 设置起点的坐标
            int x1 = r.nextInt(width);
            int y1 = r.nextInt(height);

            // 设置终点的坐标
            int x2 = r.nextInt(width);
            int y2 = r.nextInt(height);

            // 设置字体颜色
            g.setColor(randomColor());

            // 绘制干扰先
            g.drawLine(x1 , y1,x2 ,y2 );
        }
        // 9. 将缓存的图片输出到响应输出流中
        ImageIO.write(image, "png", response.getOutputStream());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
