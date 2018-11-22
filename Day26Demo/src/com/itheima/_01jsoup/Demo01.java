package com.itheima._01jsoup;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
    XML解析之获得Document对象

    jsoup与获得Document对象相关的方法
      * static Document parse(String html);
        将HTML或XML内容转换为一个Document对象

     * static Document parse(File file, String charsetName)
        根据文件对象和字符集创建Document对象
        File对象用来关联XML或HTML文件
        charsetName指定文件的编码

     * static Connection connect(String url)
        解析互联网上某个URL地址，创建连接对象
        url：互联网XML或HTML文件的地址
 */
public class Demo01 {

   /* *//*
    static Document parse(String html);
        将HTML或XML内容转换为一个Document对象
     *//*
    @Test
    public void test01(){
        // html内容
        String html = "<ul class=\"nav\"><li class=\"nav-active\"><a href=\"\">首页</a></li><li><a href=\"javascript:;\">门票</a></li><li><a href=\"javascript:;\">酒店</a></li><li><a href=\"javascript:;\">全球自由行</a></li></ul>";
        //  将HTML或XML内容转换为一个Document对象
        Document document = Jsoup.parse(html);
        System.out.println(document);
    }

    *//**
     * static Document parse(File file, String charsetName)
        根据文件对象和字符集创建Document对象
            File对象用来关联XML或HTML文件
            charsetName指定文件的编码
     *//*
    @Test
    public void test02() throws IOException {
        // 根据资源文件名从src路径下获得URL对象
        URL url = Demo01.class.getResource("/index.html");
        // 获得资源文件的绝对路径字符串
        String path = url.getPath();
        // 创建文件对象
        File file = new File(path);
        // 获得文档对象
        Document document = Jsoup.parse(file, "utf-8");
        System.out.println(document);
    }

    *//*
     static Connection connect(String url)   http://www.itcast.cn
        解析互联网上某个URL地址，创建连接对象
        url：互联网XML或HTML文件的地址

     Connection接口对象的方法：
        Document get()  通过连接好的URL，从中获得一个Document对象
    *//*
    @Test
    public void test03() throws IOException {
        // 根据网址获得连接对象
        Connection connection = Jsoup.connect("http://ntlias3.boxuegu.com/login/doSuccess#");
        // 获得文档对象
        Document document = connection.get();
        System.out.println(document);
    }*/
}
