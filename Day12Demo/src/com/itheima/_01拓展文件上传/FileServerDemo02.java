package com.itheima._01拓展文件上传;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/*
* 服务器代码：
*
* */
public class FileServerDemo02 {
    public static void main(String[] args) throws Exception {
        // 1.注册端口
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("===服务端启动===");
        while(true){
            // 2.接收客户端的请求
            Socket socket = ss.accept();
            // 3.为每个客户端的socket都创建一个独立的线程来处理他。
            new MyServerThread(socket).start();
        }
    }
}

class MyServerThread extends Thread{
    private Socket socket ;
    public MyServerThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        OutputStream os = null;
        try{
           // 3.从通信管道中得到一个字节输入流：接收文件数据。
           InputStream is = socket.getInputStream();
           DataInputStream dis = new DataInputStream(is);

           // 先读取文件的后缀名
           String suffix = dis.readUTF();


           // 定位文件最终存放的服务器路径：文件名称开发的时候一定会随机指定一个。
           os = new FileOutputStream("D:\\itcast\\班级\\服务端的仓库\\"+ UUID.randomUUID().toString()+suffix);
           // 4.定义一个桶接收文件数据。
           // 定义一个桶
           byte[] buffer = new byte[1024];
           int len = 0 ;
           while((len = dis.read(buffer))!=-1){
               // 读多少倒多少
               os.write(buffer,0,len);
           }
           System.out.println("接收结束！");
       }catch (Exception e){
           System.out.println("客户端下线了！");
       }finally {
           try {
               if(os!=null)os.close(); // 不关闭的话,图片被占用。
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
    }
}
