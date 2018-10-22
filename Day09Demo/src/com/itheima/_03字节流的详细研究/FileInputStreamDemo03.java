package com.itheima._03字节流的详细研究;

import java.io.FileInputStream;

/*
* 字节流如何读取文本文件内容输出不乱码呢?
*    定义一个桶，一桶水把整个文本文件内容全部装满。
*    虽然可以避免乱码，但是可能出现文件过大，导致字节桶过大，而出现内存溢出。
*
*    结论：字节流根本就不适合读取文本文件内容输出，
*         要么乱码，要么可能出现内存溢出。
*         文本文件的内容读取应该使用字符流。
*
* */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        // 定义一个文件字节输入流与源文件dlei01.txt接通
        FileInputStream fis =
                new FileInputStream("src/dlei01.txt");

        // 定义一个与文件一样大的桶。
      /*
        File f = new File("src/dlei01.txt");
        long size = f.length();
        byte[] buffer =new byte[(int)size];
      */
        // 直接把文件读成一桶字节数组给你。
        //byte[] buffer = fis.readAllBytes();
        // 桶的大小与文件的大小是一样大的，返回的字节数就是文件的大小
        //String rs = new String(buffer);
        //System.out.println(rs);


    }
}
