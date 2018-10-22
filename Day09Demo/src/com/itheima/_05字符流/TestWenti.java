package com.itheima._05字符流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/*
*  读写都是同一个文件：文件数据会全部丢失。
*
* */
public class TestWenti {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src/out01.txt");
        FileOutputStream fos = new FileOutputStream("src/out01.txt");
        int temp;
        while((temp = fis.read()) != -1){
            fos.write(temp);
        }
        fis.close();
        fos.close();
    }
}
