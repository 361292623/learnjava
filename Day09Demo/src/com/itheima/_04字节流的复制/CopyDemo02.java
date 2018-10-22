package com.itheima._04字节流的复制;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* JDK 1.7以后释放资源的新方式
*    资源是实现了：Closeable接口的。
* */
public class CopyDemo02 {
    public static void main(String[] args) {
        try(
                // 释放资源的新方式，用完自动关闭。
                // 这里只能放资源

                // 1.定义一个字节输入流管道与源文件：D:\itcast\mv.jpg 接通
                FileInputStream fis = new FileInputStream("D:\\itcast\\mv.jpg");
                // 2.定义一个字节输出流与目标文件接通
                FileOutputStream fos = new FileOutputStream("D:\\itcast\\班级\\meinv.jpg");

                ){

            // 定义一个桶开始转移数据。  文件大小：1024+1024+80
            byte[] buffer = new byte[1024];
            // 开始装水倒水。
            // 定义一个整数记录每次桶装了多少滴水（多少个字节数）
            int len = 0 ;
            while((len = fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
            System.out.println("复制结束！");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
