package com.itheima._02字符缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 *
 *  * IO流的分类：
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
 * (2) 缓冲字节输出流
 *     字节缓冲输出流：BufferedOutputStream
 *      功能：字节缓冲输出流是把低级的字节输出流管道包装成一个高级的缓冲字节输出流管道
 *           从而提高写数据的性能。
 *      构造器：public BufferedOutputStream(OutputStream os);
 *
 *      总结：缓冲字节输出流只是性能提高了，功能无变化的。
 *
 *      牺牲内存换取性能。
 *
 * (3) 缓冲字符输入流
 *    功能：缓冲字符输入流 是把低级的字符输入流管道包装成一个高级的缓冲字符输入流管道
 *           从而提高读数据的性能。
 *    构造器: public BufferedReader(Reader reader);
 *    总结：缓冲字符输入流性能提高了,但是它还多了一个按照行读取数据的功能。
 *         public String readLine(); 每次返回一行数据
 *
 *         建议使用缓冲字符输入流的按照行读取数据。
 *
 * (4)缓冲字符输出流。
 *    功能：缓冲字符输出流。是把低级的字符输出流包装成一个高级的缓冲字符输出流
 *       从而提高写数据的性能
 *    构造器：public BufferedWriter(Writer writer);
 *    总结：缓冲字符输出流提高了性能，但是还多一个换行的功能。
 *       public void newLine()
 *
 *
 *
 *
 */
public class BufferedWriterDemo02 {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("src/out01.txt",true);

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("itheima");
       // bw.write("\r\n");
        bw.newLine(); // 换行

        bw.write('徐');
        //bw.write("\r\n");
        bw.newLine();


        bw.close();
    }
}
