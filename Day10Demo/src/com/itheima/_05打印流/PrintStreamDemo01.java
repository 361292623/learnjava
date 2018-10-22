package com.itheima._05打印流;

import java.io.*;

/*
* 打印流：属于高级流。
*
* 打印流：PrintStream / PrintWriter
* PrintStream: 可以写字节，可以打印一切数据。
* PrintWriter: 可以写字符，可以打印一切数据。
*
* 打印流：是写数据出去的。
* 打印流的核心点：方便强大。
*
* */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws Exception {
      /*
        OutputStream os = new FileOutputStream("src/ps.txt");
        PrintStream ps = new PrintStream(os); */

        //PrintStream ps = new PrintStream("src/ps.txt");
        //ps.write("itheima".getBytes()); // 写字节。

        PrintWriter ps = new PrintWriter("src/ps.txt");
        //ps.write("itheima"); // 写字符。

        ps.println(100); // 打印整数
        ps.println(false); //
        ps.println("我爱你");

        ps.close();

    }
}
