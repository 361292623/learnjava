package com.itheima.server;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 模拟web服务器
 实现步骤
     1. 采用多线程的方法，每个用户创建一个线程。
     2. 当有用户连接的时候在服务器控制台输出信息
     3. 在线程的run方法中读取本地服务器的资源，得到输入流对象
     4. 通过Socket得到输出流，输出到客户端
     5. 客户端使用IE浏览器访问效果图如下

 浏览器访问方式：http://localhost:8080/

 */
public class MyTomcat extends Thread {

    private Socket socket;

    public MyTomcat(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 获得字节输出流对象
            OutputStream out = socket.getOutputStream();

            // 创建字节输入流关联资源文件:hello.html
            FileInputStream fis = new FileInputStream("day27_MyTomcat/hello.html");
            // 定义字节数组用来存储读取到数据
            byte[] buf = new byte[1024];
            // 定义一个变量接收实际读取到的字节数
            int len = -1;
            // 循环读写数据
            while ((len = fis.read(buf))!= -1){
                // 利用out将读取的数据输出到客户端
                out.write(buf, 0, len);
            }
            // 关闭流
            fis.close();
            // 关闭socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)throws Exception{
        // 开启服务器
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("开启服务器...");
        // 使用死循环保证服务器不退出
        while (true){
            // 等待客户端连接并与客户端关联的socket对象
            Socket socket = serverSocket.accept();
            System.out.println("客户端IP：" + socket.getInetAddress().getHostAddress());
            // 创建线程对象并开启
            new MyTomcat(socket).start();
        }
    }
}
