package com.itheima._05字符流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * IO流的体系：
 *            字节流                                  字符流
 *  字节输入流          字节输出流              字符输入流         字符输出流
 *  InputStream       OutputStream          Reader            Writer   (全是抽象类)
 *  FileInputStream   FileOutputStream      FileReader        FileWriter (全是实现类)
 *
 * 字节流读取文本文件内容输出不太合适。
 * 文本文件内容的读取输出应该使用字符流：非常合适。
 *
 * (1)文件字符输出流：以内存为基准，把内存中的数据以一个一个的字符写出到磁盘文件或者写出到网络介质中去的
 *               流，称为文件字符输出流。
 *
 *  void	close()  关闭流释放资源
    void	flush()  刷新缓冲区
    void	write(char[] cbuf) 输出一个字符数组
    void	write(char[] cbuf, int off, int len) 输出字符数组的一部分
    void	write(int c) 输出一个字符
    void	write(String str)  输出一个字符串
    void	write(String str, int off, int len) 输出一个字符串的一部分
 *
 */
public class FileWriterDeme04 {
    public static void main(String[] args) throws IOException {
       /* File destFile = new File("src/out01.txt");
        FileWriter fw = new FileWriter(destFile);*/

       // FileWriter fw = new FileWriter("src/out01.txt");

        FileWriter fw = new FileWriter("src/out01.txt",true);

        // 1.写一个一个的字符出去
        fw.write(97);
        fw.write('徐');
        fw.write('磊');
        fw.write("\r\n");

        // 2.写一个字符串出去：写一个桶出去
        fw.write("itheima欢迎您！");
        fw.write("\r\n");


        // 3.写一个字符数组出去
        char[] buffer = "itheima欢迎您！".toCharArray();
        fw.write(buffer);
        fw.write("\r\n");


        // 4.写一个字符串的一部分出去: abc我爱你
        fw.write("abc我爱你中国",0,6);
        fw.write("\r\n");


        // 5.写一个字符数组的一部分出去：倒出一个桶的一部分出去
        char[] buffer1 = "abc我爱您中国！".toCharArray();
        fw.write(buffer1,0,6);
        fw.write("\r\n");


        fw.close();
    }
}
