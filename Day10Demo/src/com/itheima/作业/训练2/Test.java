package com.itheima.作业.训练2;

import java.io.BufferedOutputStream;

import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws Exception {

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\e.txt"));
        bos.write("I love you".getBytes());
        bos.close();
    }
}
