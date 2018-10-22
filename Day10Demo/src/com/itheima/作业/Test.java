package com.itheima.作业;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        busNotong();//没有桶BufferedInputStream性能测试
        busHastong();//有桶BufferedInputStream性能测试
        fsHastong();
        fsNotong();

    }

    public static void busNotong(){//没有桶BufferedInputStream性能测试
        long startTime = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos =null;
        try {
                FileInputStream fis = new FileInputStream("d:\\Users\\XC-P\\Videos\\123.mp4");
                FileOutputStream fos = new FileOutputStream("d:\\Users\\XC-P\\Videos\\1234.mp4");
                bis =  new BufferedInputStream(fis);
                 bos =  new BufferedOutputStream(fos);

                int i = 0;
                while ((i = bis.read())!=-1){
                    bos.write(i);

                }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                bis.close();
            }catch (Exception e){
                e.printStackTrace();
            }

            try{
                bos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("没有桶的Buffered:"+(endTime-startTime));
    }

    public static void busHastong()throws Exception{////有桶BufferedInputStream性能测试
        long startTime = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos =null;

        try {  FileInputStream fis = new FileInputStream("d:\\Users\\XC-P\\Videos\\123.mp4");
        FileOutputStream fos = new FileOutputStream("d:\\Users\\XC-P\\Videos\\1235.mp4");
         bis =  new BufferedInputStream(fis);
             bos =  new BufferedOutputStream(fos);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

    }catch (Exception e){
        e.printStackTrace();
    }finally {
        try{
            bis.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            bos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    long endTime = System.currentTimeMillis();
        System.out.println("有桶的Buffered:"+(endTime-startTime));
    }


    public static void fsHastong()throws Exception{////有桶FileInputStream性能测试
        long startTime = System.currentTimeMillis();
        FileInputStream fis =null;
        FileOutputStream fos = null;

        try {
            fis= new FileInputStream("d:\\Users\\XC-P\\Videos\\123.mp4");
            fos= new FileOutputStream("d:\\Users\\XC-P\\Videos\\1236.mp4");

            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                fis.close();
            }catch (Exception e){
                e.printStackTrace();
            }

            try{
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("有桶的FileInputStream:"+(endTime-startTime));
    }

    public static void fsNotong(){//没有桶FileInputStream性能测试
        long startTime = System.currentTimeMillis();
        FileInputStream fis =null;
        FileOutputStream fos = null;
        try {
           fis = new FileInputStream("d:\\Users\\XC-P\\Videos\\123.mp4");
            fos = new FileOutputStream("d:\\Users\\XC-P\\Videos\\1237.mp4");


            int i = 0;
            while ((i = fis.read())!=-1){
                fos.write(i);

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                fis.close();
            }catch (Exception e){
                e.printStackTrace();
            }

            try{
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("没有桶的FileInputStream:"+(endTime-startTime));
    }
}
