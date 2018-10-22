package com.itheima._03字节流的详细研究;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * IO流的体系：
 *            字节流                                  字符流
 *  字节输入流          字节输出流              字符输入流         字符输出流
 *  InputStream       OutputStream          Reader            Writer   (全是抽象类)
 *  FileInputStream   FileOutputStream      FileReader        FileWriter (全是实现类)
 *
 *  (1)FileOutputStream：文件字节输出流。
 *     以内存为基准，把内存中的数据以一个一个的字节写出到磁盘文件或者写出到网络介质中去的
 *               流，称为文件字节输出流。
 *     写数据到文件中去。
 *
 *     构造器：
 *        a.public FileOutputStream(File file)
                 throws FileNotFoundException

          b.public FileOutputStream(String name)
                 throws FileNotFoundException

          c.public FileOutputStream(String name,
                        boolean append)
                 throws FileNotFoundException

   输出流：
       1.默认每次写数据的时候都会覆盖文件之前的全部数据。
       2.追加数据：
         // 参数二：true,io流以后写的数据只是追加不会覆盖之前的内容。
         OutputStream fos = new FileOutputStream("src/out.txt",true);
       3.换行：
            // 换行  \r\n兼容性好！
            fos.write("\r\n".getBytes());

 *
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) throws Exception {

       /* File destFile = new File("src/out.txt");
        // 定义一个字节输出流管道与目标文件destFile接通
        OutputStream fos = new FileOutputStream(destFile);*/

//        OutputStream fos = new FileOutputStream("src/out.txt");
        // 参数二：true,io流以后写的数据只是追加不会覆盖之前的内容。
        OutputStream fos = new FileOutputStream("src/out.txt",true);


        // 通过fos管道写数据到文件中去。
        // 1.只能写一个字节出去
        fos.write(97);
        fos.write('e');
        // '徐'是三个字节 [ooo] -> o 实际上只写了第一个字节输出，所以会乱码。
        // fos.write('徐');
        // 换行  \r\n兼容性好！
        fos.write("\r\n".getBytes());


        // 2.写一个字节数组（写一个桶出去）
        // 把字符串直接转换成一个字节数组:以默认的编码的方法去拿字节数组：UTF-8
        byte[] buffer = "itheima欢迎你".getBytes();
        // 可以以特定编码的方法去拿字节数组桶。
        //byte[] buffer1 = "itheima欢迎你".getBytes("GBK");
        //System.out.println(buffer1.length);
        fos.write(buffer);
        fos.write("\r\n".getBytes());

        byte[] buffer2 = "abc我爱你中国".getBytes();
        // 3.可以写一个桶的一部分出去：写12个字节出去。
        fos.write(buffer2,0,12);
        fos.write("\r\n".getBytes());

       // fos.flush(); // 把数据刷新进去。
        fos.close(); // 关闭资源。关闭包含刷新。此时不需要刷新语句了


    }
}
