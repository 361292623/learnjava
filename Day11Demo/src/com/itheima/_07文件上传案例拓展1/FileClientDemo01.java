package com.itheima._07文件上传案例拓展1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* 本案例实现：服务端永远不死亡，服务端可以接收任意多个客户端的连接。
*
* 文件上传:
*    业务：上传一张照片，上传一个文件。
*    要求：需要客户端，需要服务端
*    技术选择：Socket网络编程（可靠安全）
*
*  业务难点：
*     客户端上传的文件类型格式，服务端是需要知道的。
*    .txt            .txt
*    .png            .png
*    .jpg            .jpg
*    .rar            .rar
*
*  简单版：我们认为发送的就是某种类型的文件格式。（必须掌握）
*  复杂版：什么都可以传给我，我都可以搞定。（拓展）
*
*
*/
public class FileClientDemo01 {
    public static void main(String[] args) throws Exception {
      while (true){
          // 1.创建客户端 上传：*.jpg
          // 1.连接服务端建立Socket通信管道
          Socket socket = new Socket("127.0.0.1",7777);
          // 2.获取一个字节输出流：发送文件数据
          OutputStream os = socket.getOutputStream();
          // 3.定位需要发送的文件
          InputStream is = new FileInputStream("D:\\itcast\\班级\\meinv.jpg");
          // 定义一个桶
          byte[] buffer = new byte[1024];
          int len = 0 ;
          while((len = is.read(buffer))!=-1){
              // 读多少倒多少
              os.write(buffer,0,len);
          }
          // 发送数据完毕的信号！
          socket.shutdownOutput();
          System.out.println("发送完毕！");
      }
    }
}
