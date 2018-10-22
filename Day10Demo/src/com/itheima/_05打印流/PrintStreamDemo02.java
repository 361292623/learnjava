package com.itheima._05打印流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/*
* 流向的改变：
*
*
* */
public class PrintStreamDemo02 {
    public static void main(String[] args) throws FileNotFoundException {

        OutputStream os = new FileOutputStream("src/sys.txt",true);
        PrintStream ps = new PrintStream(os);

        System.setOut(ps); // 系统的输出以后都流向ps管道

        System.out.println("itheima欢迎您！");
        System.out.println("itheima欢迎您！");
        System.out.println("itheima欢迎您！");
        System.out.println("itheima欢迎您！");
        System.out.println("itheima欢迎您！");
        System.out.println("itheima欢迎您！");
        System.out.println("itheima欢迎您！");
    }
}
