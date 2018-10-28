package com.itheima.作业.UDP通信;

import java.net.*;

public class ClientDatagramSocketDemo {
    public static void main(String[] args) throws Exception {
        byte[] bytes = "12345qwert".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,
                InetAddress.getByName("127.0.0.1"),8899);
        DatagramSocket socket = new DatagramSocket();
        socket.send(packet);
        socket.close();
    }
}
