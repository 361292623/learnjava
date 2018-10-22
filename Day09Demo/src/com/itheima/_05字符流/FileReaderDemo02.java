package com.itheima._05字符流;

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
 *     本代码是重点：
 */
public class FileReaderDemo02 {
    public static void main(String[] args) throws Exception {
       /* File f = new File("src/dlei01.txt");
        // 定义一个字符输入管道与源文件接通
        FileReader fr = new FileReader(f);*/
        // a  b c  我        爱        你
        FileReader fr = new FileReader("src/dlei01.txt");
        // 2.一桶一桶的读取：字符数组。
      /*  char[] buffer = new char[8];
        // 返回每次读取的字符个数，读取完毕以后返回-1
        int len = fr.read(buffer);
        String rs = new String(buffer,0,len);
        System.out.println(rs);*/

        char[] buffer = new char[8];
        int len =  0 ;
        while((len = fr.read(buffer))>0){
            String rs = new String(buffer,0,len);
            System.out.print(rs);
        }


    }
}
