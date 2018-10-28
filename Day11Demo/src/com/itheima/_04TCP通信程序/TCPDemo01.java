package com.itheima._04TCP通信程序;
/*

Socket网络编程（TCP通信）：
    只要你写的代码是Socket代码，底层就是TCP通信。

TCP ==> Transfer Control Protocol ==> 可靠传输控制协议

TCP/IP协议的特点
    * 面向连接的协议。
    * 通过三次握手建立连接，连接成功形成数据传输通道。
    * 通过四次挥手断开连接。
    * 基于IO流进行数据传输。
    * 传输数据大小没有限制。
    * 因为面向连接的协议，速度慢，但是是可靠的协议。

TCP协议的使用场景
    * 文件上传和下载
    * 邮件发送和接收
    * 远程登录

TCP协议相关的类
    * Socket
        * 一个该类的对象就代表一个客户端程序。
    * ServerSocket
        * 一个该类的对象就代表一个服务器端程序。

Socket(端口，套接字, socket管道)
Socket类构造方法
    * Socket(String host, int port)
        * 根据ip地址字符串和端口号创建客户端Socket对象
        * 注意事项：只要执行该方法，就会立即连接指定的服务器程序，如果连接不成功，则会抛出异常。
            如果连接成功，则表示三次握手通过。

Socket类常用方法
    * OutputStream getOutputStream(); 获得字节输出流对象
    * InputStream getInputStream();获得字节输入流对象
*
*
*
* */
public class TCPDemo01 {
}
