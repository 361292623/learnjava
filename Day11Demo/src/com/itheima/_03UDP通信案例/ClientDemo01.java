package com.itheima._03UDP通信案例;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
UDP协议的特点
    * 面向无连接的协议
    * 发送端只管发送，不确认对方是否能收到。发出去就不管了。
    * 基于数据包进行数据传输。（ 把数据打包发送就完事了）
    * 发送数据的大小限制64K以内（最多只能发送64KB）
    * 因为面向无连接，速度快，但是不可靠。

UDP协议的使用场景：
    * 在线视频
    * 网络语音电话

UDP协议相关的两个类
    * DatagramPacket（包装数据包，发送的数据在这里包装）
        * 数据包对象
        * 作用：用来封装要发送或要接收的数据，比如：集装箱
    * DategramSocket（发送数据的对象）
        * 发送对象
        * 作用：用来发送或接收数据包，比如：码头

DatagramPacket类构造方法
    * DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        * 创建发送端数据包对象
        * buf：要发送的内容，字节数组
        * length：要发送内容的长度，单位是字节
        * address：接收端的IP地址对象
        * port：接收端的端口号
    * DatagramPacket(byte[] buf, int length)
        * 创建接收端的数据包对象
        * buf：用来存储接收到内容
        * length：能够接收内容的长度

DatagramPacket类常用方法
    * int getLength() 获得实际接收到的字节个数

DatagramSocket类构造方法
    * DatagramSocket() 创建发送端的Socket对象，系统会随机分配一个端口号。
    * DatagramSocket(int port) 创建接收端的Socket对象并指定端口号

DatagramSocket类成员方法
    * void send(DatagramPacket dp) 发送数据包
    * void receive(DatagramPacket p) 接收数据包

广州： 看我的视频。
   1.互动
   2.思路清晰
   3.拓展多



*
*/
public class ClientDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个数据包对象 。
        /*
        参数一：消息的字节形式。
        参数二：发送的数据的大小。
        参数三：对方服务端的IP
        参数三：对方服务端的端口
        DatagramPacket(byte buf[], int length,
        InetAddress address, int port)
        */


        byte[] msg = "itheima欢迎您！".getBytes();
        DatagramPacket packet = new DatagramPacket(msg,
                msg.length, InetAddress.getByName("192.168.80.79"),9999);

        // 2.创建一个发送消息的对象。
        DatagramSocket socket = new DatagramSocket();
        // 发送数据包
        socket.send(packet);
        // 关闭通信管道
        socket.close();
    }
}
