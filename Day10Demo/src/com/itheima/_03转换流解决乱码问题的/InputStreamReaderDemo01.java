package com.itheima._03转换流解决乱码问题的;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * IO流的分类：
 *       字节流                                            字符流
 * 字节输入流             字节输出流                 字符输入流          字符输出流
 * InputStream          OutputStream             Reader            Writer    (抽象类)
 * FileInputStream      FileOutputStream         FileReader        FileWriter (实现类)
 * BufferedInputStream  BufferedOutputStream     BufferedReader    BufferedWriter (实现类)
 *                                               InputStreamReader OutputStreamWriter
 *
 *
 * 字符转换流：属于字符流。
 *   字符转换输入流（InputStreamReader）：把原始的字节流转成字符流，”可以解决不同编码读取乱码的问题“。
 *   字符转换输出流（OutputStreamWriter）：把原始的字节输出流转换成字符输出流，”可以指定写出去的数据编码“
 *
 * 乱码的原因
 *    因为文本在存储时使用的码表和读取时使用的码表不一致造成的。
 *
 *
 */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws Exception {
        // 代码环境编码：UTF-8
        // 文件编码： UTF-8
        // 此时不会乱码，原始读取的编码和文件的编码是一样的，都是UTF-8
        FileReader fr = new FileReader("src/csb.txt");
        // 使用缓冲字符输出流
        BufferedReader br = new BufferedReader(fr);
        String line = null ;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
    }
}
