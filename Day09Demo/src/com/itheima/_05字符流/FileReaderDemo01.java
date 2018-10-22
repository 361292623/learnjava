package com.itheima._05字符流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
 * （1）FileReader : 文件字符输入流。
 *     以内存为基准，把磁盘中的文件以一个一个的字符读入到内存中的
 *               流，称为文件字符输入流。
 *
 */
public class FileReaderDemo01 {
    public static void main(String[] args) throws Exception {
       /* File f = new File("src/dlei01.txt");
        // 定义一个字符输入管道与源文件接通
        FileReader fr = new FileReader(f);*/

        FileReader fr = new FileReader("src/dlei01.txt");

        // 1.一个一个字符的读取 ， 返回字符的编号。
        // 如果读取完毕了返回-1
       /* int ch = fr.read();
        System.out.println(ch);

        int ch1 = fr.read();
        System.out.println(ch1);

        int ch2 = fr.read();
        System.out.println(ch2);*/

        int code = 0 ;
//        while((code = fr.read()) > 0){
        while((code = fr.read()) != -1){
            System.out.print((char)code);
        }

    }
}
