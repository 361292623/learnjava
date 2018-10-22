package com.itheima._03字节流的详细研究;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 字符集：
 *    英文和数字在任何编码中都占1个字节。
 *    GBK 一个中文占2个字节。
 *    UTF-8 一个中文一般占用3个字节
 *
 * IO流的体系：
 *            字节流                                  字符流
 *  字节输入流          字节输出流              字符输入流         字符输出流
 *  InputStream       OutputStream          Reader            Writer   (全是抽象类)
 *  FileInputStream   FileOutputStream      FileReader        FileWriter (全是实现类)
 *
 * (1)文件字节输入流：FileInputStream
 *    功能：以内存为基准，把磁盘中的文件以一个一个的字节读入到内存中的
 *               流，称为字节输入流。
 *         读取磁盘文件数据的。
 *    构造器：
 *      a.public FileInputStream(File file) throws FileNotFoundException
 *      b.public FileInputStream(String name) throws FileNotFoundException
 *
 *
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
//        // 1.定位源文件
//        File f = new File("src/dlei.txt");
//        // 2.创建一个文件字节输入流对象与源文件f接通
//        FileInputStream fis = new FileInputStream(f);

          // 1.创建一个文件字节输入流对象与源文件f接通
          FileInputStream fis = new FileInputStream("src/dlei.txt");
          // 读取文件的数据：以字节的形式读取。 ab我爱你。

          // read()每次读取一个字节返回。每次读取一滴水。
          // 如果数据已经读取完毕了，返回-1。
          int ch1 = fis.read();
          System.out.println((char)ch1);

          int ch2 = fis.read();
          System.out.println((char)ch2);

          // -1:说明读取完毕了
       /*   int ch3 = fis.read();
          System.out.println(ch3);*/

          //a  b   我      爱      你
          //o  o   [ooo]  [ooo]   [ooo]

          // 定义一个字节数组来读取文本文件内容：定义一个桶。
          byte[] buffer = new byte[20];
          // 从字节输入流管道去装桶，会返回每次读取到的字节数，读取完毕会返回-1。
          // 读取的数据是装入了buffer字节数组中。
          int len = fis.read(buffer);
          System.out.println(len);
          // 把字节数组中的全部数据转换成字符串
          // buffer字节中读多少倒出多少。
          String rs = new String(buffer,0,len);
          System.out.println(rs) ;

    }
}
