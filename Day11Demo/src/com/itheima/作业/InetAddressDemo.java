package com.itheima.作业;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo
{
    public static void main(String[] args) throws Exception {
        InetAddress inet  = InetAddress.getLocalHost();
        InetAddress inet1  = InetAddress.getByName("192.168.1.1");
        InetAddress[] inet2  = InetAddress.getAllByName("127.0.0.1");

//        System.out.println(inet.getHostName());
//        System.out.println(inet.getHostAddress());
//        System.out.println(inet1.getHostName());
//        System.out.println(inet1.getHostAddress());
//
//        System.out.println(inet2[0].getHostAddress());
//        System.out.println(inet2[1].getHostAddress())
        InetAddress ip  = InetAddress.getByName("www.baidu.com");
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());




    }
}
