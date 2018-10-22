package com.itheima._03转换流解决乱码问题的;

import java.io.*;

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
 *      Reader fr = new InputStreamReader(is); // 把原始的字节流转成字符流，这里的转换依然采用默认编码：UTF-8
        Reader fr = new InputStreamReader(is,"GBK"); //把原始的字节流转成字符流， 这里是指定GBK读取字符文件
 *      总结：字符输入流只要保证读取进来的字符没有乱码，以后永远不会乱码。
 *           字符输入流如果读取进来就乱码了，那么以后还是会乱码。
 *
  *  字符转换输出流（OutputStreamWriter）：把原始的字节输出流转换成字符输出流，”可以指定写出去的数据编码“
 *
 * 乱码的原因
 *    因为文本在存储时使用的码表和读取时使用的码表不一致造成的。
 *
 *
 *
 */
public class InputStreamReaderDemo03 {
    public static void main(String[] args) throws Exception {
        // 转换流的思想：
        // 1.我先提取被读取文件的原始字节流。 我     爱    你 a  b  c  ： GBK
        //                             [oo]  [oo] [oo] o  o o
        InputStream is = new FileInputStream("D:\\itcast\\班级\\Java98期就业班\\dlei.txt");
       // Reader fr = new InputStreamReader(is); // 这里的转换依然采用默认编码：UTF-8
        Reader fr = new InputStreamReader(is,"GBK"); // 这里是指定GBK读取字符文件
        // 使用缓冲字符输出流。
        BufferedReader br = new BufferedReader(fr);

        String line = null ;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }

    }
}
