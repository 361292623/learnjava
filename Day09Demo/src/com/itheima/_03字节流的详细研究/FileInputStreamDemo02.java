package com.itheima._03字节流的详细研究;

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
 * void	close()  关闭流释放资源
 *
 * int	read()   读取一个字节，返回读取到的字节数,如果读取到文件末尾，则返回-1
 *
 * int	read(byte[] b)
 * 将读取到内容存储到字节数组b中，返回实际读取到字节个数
 * 如果读取到文件末尾，则返回-1
 *
 * 总结：
 *    字节流根本就不适合读取文本文件内容输出。无法避免乱码！！！
 *
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        // 需求：把文本文件的内容全部读取输出
        FileInputStream fis = new FileInputStream("src/dlei01.txt");
        // 一个一个字节的读取文本文件的内容输出: 完全不靠谱，因为无法读取中文。
       /* int ch = fis.read();
        while(ch != -1){
            System.out.print((char)ch);
            ch = fis.read();
        }*/

       /*
        int ch = 0;
        while((ch = fis.read()) != -1){
            System.out.print((char)ch);
        }
        */

        // 一个桶一个桶的去读取文本文件内容输出 :
        // a b c d 我     爱     你    a
        byte[] buffer = new byte[3];
        int len = fis.read(buffer);
        while (len != -1){
            String rs = new String(buffer,0,len);
            System.out.print(rs);
            len = fis.read(buffer);
        }
    }
}
