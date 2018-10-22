package com.itheima.作业.训练3;

import java.io.*;

public class CopyDemo {

    public static void main(String[] args) throws Exception {


        FileInputStream fis = new FileInputStream("d:\\Users\\XC-P\\Videos\\123.mp4");
        FileOutputStream fos = new FileOutputStream("d:\\Users\\XC-P\\Videos\\1234.mp4");
        BufferedInputStream bis  =null;
        BufferedOutputStream bos = null;

        try{
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] bytes = new byte[1024];
            while (bis.read(bytes)!=-1){
                bos.write(bytes);
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            bis.close();
            bos.close();
        }
        System.out.println("复制完成");
    }
}
