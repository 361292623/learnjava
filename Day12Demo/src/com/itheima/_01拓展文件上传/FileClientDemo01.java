package com.itheima._01拓展文件上传;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/*
* 文件上传的案例：
*    拓展：
*
*   任意类型的文件都支持上传：
*   .jpg
*   .png
*   .txt
*
*
* */
public class FileClientDemo01 {
    public static void main(String[] args) throws IOException {

        // 2.获取需要发送的文件。
        while(true){
            // 1.连接服务器
            Socket socket = new Socket("127.0.0.1",7777);
            File f = new File("D:\\itcast\\班级\\客户端");
            File[] files = f.listFiles() ;
            if(files!=null && files.length>0){
                for(File f1 : files){
                    System.out.println("\t"+f1.getName());
                }
            }
            System.out.println("请选择您需要上传的文件：");
            Scanner scan = new Scanner(System.in);
            String fileName = scan.next(); // meinv.jpg

            // 获取这个文件对象：
            File srcFile = new File(f,fileName);
            // 开始上传。
            // 1.先告诉服务端你 的文件类型
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(fileName.substring(fileName.lastIndexOf("."))); // 发送文件类型的后缀
            // 2.其次上传文件数据
            InputStream is = new FileInputStream(srcFile);
            byte[] buffer = new byte[1024];
            int len = 0 ;
            while ((len = is.read(buffer))!=-1){
                dos.write(buffer,0,len);
            }
            socket.shutdownOutput();

        }
    }
}




