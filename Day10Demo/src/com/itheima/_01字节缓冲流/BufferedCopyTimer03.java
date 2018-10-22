package com.itheima._01字节缓冲流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
* 研究缓冲流的性能问题：
*   研究缓冲流是否比低级流的读写性能快。
*
*   需求：复制
*      源文件：D:\itcast\班级\Java98期就业班\就业班-day09-字节流、字符流\视频\04.字节输入流的介绍.wmv
*      目标文件：D:\itcast\班级\Java98期就业班\就业班-day09-字节流、字符流\04.字节输入流的介绍.wmv
*
*   总结：以后都应该使用高级缓冲流。
*
* */
public class BufferedCopyTimer03 {


    public static void main(String[] args) {
        copy1();
        copy2();
    }

    /**
     * 低级流复制
     */
    public static void copy1(){
        long startTime = System.currentTimeMillis();
        BufferedInputStream bis = null ;
        BufferedOutputStream bos = null ;
        try{
            // 1.定义一个文件字节输入流管道与源文件接通
            FileInputStream fis = new FileInputStream("D:\\itcast\\班级\\Java98期就业班\\就业班-day09-字节流、字符流\\视频\\04.字节输入流的介绍.wmv");
            bis = new BufferedInputStream(fis); // 包装成缓冲字节输入流
            // 2.定义一个字节输出流管道与目标文件接通
            FileOutputStream fos = new FileOutputStream("D:\\itcast\\班级\\Java98期就业班\\就业班-day09-字节流、字符流\\04-02.字节输入流的介绍.wmv");
            bos = new BufferedOutputStream(fos); // 包装成缓冲字节输出流

            // 3.定义一个字节数组(桶)转移数据。
            byte[] buffer = new byte[1024];
            int len = 0 ;
            while((len = bis.read(buffer)) > 0){
                // 读多少倒出多少。
                bos.write(buffer,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(bis!=null)bis.close();
            }catch (Exception e){
                e.printStackTrace();
            }

            try{
                if(bos!=null)bos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("高级流耗时："+(endTime - startTime));
    }

    /**
     * 低级流复制
     */
    public static void copy2(){
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null ;
        FileOutputStream fos = null ;
        try{
            // 1.定义一个文件字节输入流管道与源文件接通
            fis = new FileInputStream("D:\\itcast\\班级\\Java98期就业班\\就业班-day09-字节流、字符流\\视频\\04.字节输入流的介绍.wmv");
            // 2.定义一个字节输出流管道与目标文件接通
            fos = new FileOutputStream("D:\\itcast\\班级\\Java98期就业班\\就业班-day09-字节流、字符流\\04-01.字节输入流的介绍.wmv");
            // 3.定义一个字节数组(桶)转移数据。
            byte[] buffer = new byte[1024];
            int len = 0 ;
            while((len = fis.read(buffer)) > 0){
                // 读多少倒出多少
                fos.write(buffer,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(fos!=null)fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }

            try{
                if(fis!=null)fis.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("低级流耗时："+(endTime - startTime));
    }
}
