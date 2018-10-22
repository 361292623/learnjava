package com.itheima._04字节流的复制;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 字节流做文件的复制：
*    字节流是适合做任何文件类型数据的复制的。
*    因为操作系统中所有的文件都是字节组成的。
*    字节流复制只是把源文件的全部字节一字不漏的全部转移给目标文件
*    只要源文件与目标文件的类型格式一样绝对不会出问题。
*
*    源文件：D:\itcast\mv.jpg
*    目标文件：D:\itcast\班级\meinv.jpg
*
* */
public class CopyDemo01 {
    public static void main(String[] args) {
        FileInputStream fis = null ;
        FileOutputStream fos = null ;
        try{
            // 1.定义一个字节输入流管道与源文件：D:\itcast\mv.jpg 接通
            fis = new FileInputStream("D:\\itcast\\mv.jpg");
            // 2.定义一个字节输出流与目标文件接通
            fos = new FileOutputStream("D:\\itcast\\班级\\meinv.jpg");
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
        }finally {
                try {
                    // 释放资源
                    if(fos!=null) fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    // 释放资源
                    if(fis!=null)fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
