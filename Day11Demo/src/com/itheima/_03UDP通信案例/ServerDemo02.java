package com.itheima._03UDP通信案例;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

// 服务端 ： 收消息。
public class ServerDemo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("===服务端启动==");
        // 1.创建一个数据包来接收客户端的消息
        /*
         * DatagramPacket(byte[] buf, int length)
         * 创建接收端的数据包对象
         * buf：用来存储接收到内容
         * length：能够接收内容的长度
         */
        // 定义一个字节数组接收收到的消息
        byte[] msg = new byte[64*1024];
        DatagramPacket packet = new DatagramPacket(msg,msg.length);

        // 2.注册端口 ，接收数据。
        DatagramSocket socket = new DatagramSocket(9999);

        // 3.开始接收消息：等待状态！等待收消息！
        socket.receive(packet);

        // 4.输出收到的消息；在字节数组桶msg中
        // packet.getLength() :获取收到消息的大小。
        String rs = new String(msg,0,packet.getLength());
        System.out.println(rs);

        socket.close();
    }
}
