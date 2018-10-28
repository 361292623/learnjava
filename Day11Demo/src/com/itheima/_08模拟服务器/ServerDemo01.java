package com.itheima._08模拟服务器;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 模拟服务器：
*      模拟 B/S 架构
*      在浏览器中访问程序得到一个网页。
*      以后永远不需要自己这样来做B/S开发，效率低下，问题太多，无法结构。
*
*  客户端 -> 服务端
*  浏览器 ->  ?
*
*
* */
public class ServerDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.注册端口
        ServerSocket ss = new ServerSocket(6666);
        while(true){
            // 2.接收客户端的访问请问：连接
            Socket socket = ss.accept();
            new MyThread(socket).start();
        }
    }
}

class MyThread extends Thread{
    private Socket socket ;
    public MyThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        OutputStream os = null ;
        try{
            // 2.把网页数据直接响应回去即可。
            InputStream is = new FileInputStream("src/baidu.html");
            // 把文件直接读成一个字节数组（网页的全部数据）
            //byte[] datas = is.readAllBytes();
            byte[] datas = new byte[1000];
                    is.read(datas);

            //  意思是说我现在响应的是一个Http请求的结果
            // 200 响应的是成功的网页数据。
           String html = "http/1.1 200 ok\n"
                   +"\n\n"
                   + new String(datas);

            // 3.响应网页数据给请求方。
            // 从socket管道中得到一个字节输出流。
            os = socket.getOutputStream();
            os.write(html.getBytes());
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(os!=null)os.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
