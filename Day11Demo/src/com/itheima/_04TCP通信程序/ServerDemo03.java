package com.itheima._04TCP通信程序;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
    }
}
