package com.itheima._06文件上传案例;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
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
        // 2.接收客户端的请求
        Socket socket = ss.accept();
        // 3.从通信管道中得到一个字节输入流：接收文件数据。
        InputStream is = socket.getInputStream();
        // 定位文件最终存放的服务器路径：文件名称开发的时候一定会随机指定一个。
        OutputStream os = new FileOutputStream("D:\\itcast\\班级\\服务端的仓库\\"+ UUID.randomUUID().toString()+".jpg");
        // 4.定义一个桶接收文件数据。
        // 定义一个桶
        byte[] buffer = new byte[1024];
        int len = 0 ;
        while((len = is.read(buffer))!=-1){
            // 读多少倒多少
            os.write(buffer,0,len);
        }
        System.out.println("接收结束！");
    }
}
