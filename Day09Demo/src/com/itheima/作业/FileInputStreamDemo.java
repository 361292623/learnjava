package com.itheima.作业;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fip = new FileInputStream("Day09Demo\\src\\com\\itheima\\作业\\AAA.txt");
      //  FileOutputStream fop = new FileOutputStream("Day09Demo\\src\\com\\itheima\\作业\\AAA.txt");
        //byte[] bytes = new byte[]{97};
        //fop.write(bytes);


        byte[] bytes = new byte[3];
        int len =0;
        while (( len = fip.read(bytes))!=-1){
            String ss = new  String(bytes,0,len);
            System.out.println(ss);
        }


    }

}
