package com.itheima._05TCP通信程序拓展;

import java.io.*;
import java.net.Socket;

/*
* 本案例实现： 2.客户端发送消息，服务端接收消息，服务端响应消息，客户端接收响应。
*
* 客户端
*  通信是很严格的：对方怎么发，服务端必须怎么收。
*               对方发什么，你必须收什么。
*               对方发多少，你必须收多少。
*
* 功能：
*     1.客户端发送消息，服务端接收消息。
*     2.客户端发送消息，服务端接收消息，服务端响应消息，客户端接收响应。
*
*     3.客户端可以反复的发送消息，服务端可以反复的接收消息。
*     4.服务端可以接收多个客户端的连接和消息(群聊)。
*     5.服务端可以接收多个客户端的连接，客户端和客户端可以通信。（群聊，私聊）
*
* */
public class ClientDemo02 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个Socket对象与服务端建立Socket管道通信：连接服务端
        // 参数一：服务端所在机器的IP
        // 参数二：服务端的端口
        Socket socket = new Socket("127.0.0.1",8888);
        // 2.客户端要从socket通信管道中得到一个字节输出流。
        OutputStream os = socket.getOutputStream();
        // 3.发送数据
        // 打印流
        // 把字节输出流包装成打印流
        PrintStream ps = new PrintStream(os);
        //发送消息
        ps.println("我是客户端，我给你发了：约吗？");

        // 去收服务端响应的消息
        // 4.从socket管道中得到一个字节输入流管道
        InputStream is = socket.getInputStream();
        // 接收一行消息。
        // 把字节输入流转换成缓冲字符输入流。
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        // 读取数据
        String line = null ;
        if((line = br.readLine())!=null){
            System.out.println(line);
        }

    }
}
