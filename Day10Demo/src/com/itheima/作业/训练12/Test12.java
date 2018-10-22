package com.itheima.作业.训练12;

import sun.nio.cs.ext.GBK;

import java.io.*;

public class Test12 {
    public static void main(String[] args) throws Exception {

        BufferedReader br=null;
        BufferedWriter bw=null;
        FileInputStream fis = new FileInputStream("Day10Demo\\src\\com\\itheima\\作业\\a.txt");
        FileOutputStream fos = new FileOutputStream("Day10Demo\\src\\com\\itheima\\作业\\b.txt");
      try {
            br = new BufferedReader(new InputStreamReader(fis,"utf8"));
            bw = new BufferedWriter(new OutputStreamWriter(fos,"GBK"));

            String line = null;
            while ((line = br.readLine())!=null){
                System.out.println(line);
                bw.write(line);
                bw.newLine();

            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            bw.close();
            br.close();
        }
//        FileReader fr = new FileReader("Day10Demo\\src\\com\\itheima\\作业\\b.txt");
//
//        char[] c = new char[1];
//        int len =0;
//        while ((len=fr.read(c))!=-1){
//        System.out.print(new String(c,0,len));
    //}
        FileInputStream fis1 = new FileInputStream("Day10Demo\\src\\com\\itheima\\作业\\b.txt");
        InputStreamReader isr1 = new InputStreamReader(fis1,"GBK");
        BufferedReader br1 = new BufferedReader(isr1);
        String s;
        while ((s= br1.readLine())!=null){
            System.out.println(s);
        }
        br1.close();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
}

}
