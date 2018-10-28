package com.itheima.作业.UDP通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerDatagramSocketDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("服务开启");
        byte[] bytes = new byte[64*1024];

        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

        DatagramSocket socket =new DatagramSocket(8899);
        System.out.println("开始监听");
        socket.receive(packet);

        System.out.println(new String(bytes,0,packet.getLength()));
        socket.close();
    }
}
