package com.itheima.作业;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {

        FileWriter files =
                new FileWriter("Day09Demo\\src\\com\\itheima\\" +
                        "作业\\FileWriterDemo.txt",true);
        files.write("malakekke");
        files.write("\r\n");
        files.write("121312121");
        files.close();

        FileInputStream fip = new FileInputStream("Day09Demo\\src\\com\\itheima\\" +
                "作业\\FileWriterDemo.txt");
        FileOutputStream fop = new FileOutputStream("Day09Demo\\src\\com\\itheima\\" +
                "作业\\FileWriterDemo1.txt");
        int i = -1;
        while ((i=fip.read())!=-1){
            fop.write(i);
        }
        fip.close();
        fop.close();

    }
}
