package com.itheima._05TCP通信程序拓展;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 服务端接收消息
* */
public class ServerDemo03 {
    public static void main(String[] args) throws IOException {
        System.out.println("==服务端启动==");
        // 1.注册端口
        ServerSocket ss = new ServerSocket(8888);
        // 2.接收客户端的连接请求:等待连接。
        Socket socket = ss.accept();
        // 3.从socket通信管道中得到一个字节输入流。
        InputStream is = socket.getInputStream();
        // 4.把字节输入流转换成缓冲字符输入流。
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        // 读取数据
        String line = null ;
        if((line = br.readLine())!=null){
            System.out.println(line);
        }

        // 5.响应数据给客户端。 DataInputStream / DataOutputStream
        // 从socket管道中得到一个字节输出流。
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println("收到消息，回复：不约！！");


    }
}
