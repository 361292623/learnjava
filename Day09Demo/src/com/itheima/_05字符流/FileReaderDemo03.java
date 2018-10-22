package com.itheima._05字符流;
import java.io.FileReader;

/*
* 介绍以下：
 *  a.void close();
 *
 *  b.int   read() 读取一个字符
 *
 *  c.int   read(char[] cbuf)
     * 读取一个字符数组
     * 返回实际读取的字符个数
 *
 *  d.int	read(char[] cbuf, int off, int len)
     * 读取指定个数的字符到一个字符数组中去。
     * 返回实际读取的字符个数
*/
public class FileReaderDemo03 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/dlei01.txt");
        char[] buffer = new char[1024];
        // 只装10个字符。
        int len = fr.read(buffer,0,10);
        String rs = new String(buffer,0,len);
        System.out.println(rs);
    }
}
