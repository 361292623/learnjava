package com.itheima._04字节流的复制;

import java.io.Closeable;
import java.io.IOException;

/*
* 拓展:
* 自定义资源 和 JDK 1.7自动释放资源的深入研究。
*
* */
public class TestResourcesDemo03 {
    public static void main(String[] args) {
        try(
                MyMySqlConn conn1 = new MyMySqlConn("连接用户表");
                MyMySqlConn conn2= new MyMySqlConn("连接班级表");
                ){

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class MyMySqlConn implements Closeable{

    private String name ;

    public MyMySqlConn(String name) {
        this.name = name;
    }

    @Override
    public void close() throws IOException {
        System.out.println(this.name+"资源被关闭！");
    }
}
