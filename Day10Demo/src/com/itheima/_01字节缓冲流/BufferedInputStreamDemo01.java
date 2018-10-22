package com.itheima._01字节缓冲流;

import java.io.*;

/*
* IO流的分类：
*       字节流                                            字符流
* 字节输入流             字节输出流               字符输入流      字符输出流
* InputStream          OutputStream             Reader         Writer    (抽象类)
* FileInputStream      FileOutputStream         FileReader     FileWriter (实现类)
* BufferedInputStream  BufferedOutputStream     BufferedReader BufferedWriter (实现类)
*
* 缓冲流（Bufferedxxxxx）：
*  字节缓冲流
*   -- 字节缓冲输入流：BufferedInputStream
*   -- 字节缓冲输出流：BufferedOutputStream
* 字符缓冲流
*   -- 字符缓冲输入流：BufferedReader
*   -- 字符缓冲输出流：BufferedWriter
*
* 缓冲流的概述
*     缓冲流又称为高效流（高级流）
*
* 缓冲流性能高效的原理
*     缓冲流都临时使用缓冲区(数组)存储多个数据，来提高IO读写数据的性能。
*
* （1） 字节缓冲流：
*      字节缓冲输入流：BufferedInputStream
*      功能：字节缓冲输入流是把低级的字节输入流管道包装成一个高级的缓冲字节输入流管道
*           从而提高读数据的性能。
*      构造器： public BufferedInputStream(InputStream is);
*
*      总结：缓冲字节输入流只是性能提高了，功能无变化。
*
* */
public class BufferedInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 定义一个低级的字节输入流管道与源文件接通
        File srcFile = new File("src\\com\\itheima\\_01字节缓冲流\\BufferedInputStreamDemo01.java");
        InputStream is = new FileInputStream(srcFile);
        // 缓冲字节输入流：字节缓冲输入流是把低级的字节输入流管道包装成一个高级的
        // 缓冲字节输入流管道
        BufferedInputStream bis = new BufferedInputStream(is);

        // 定义一个桶来读取：不适合的，会乱码。
        byte[] buffer = new byte[8];
        int len = 0 ;
        while((len = bis.read(buffer))!=-1){
            String rs = new String(buffer,0,len);
            System.out.print(rs);
        }
    }
}
