package com.itheima._01jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
    jsoup获得元素对象-- 使用get方法获取

    Document类与获得元素对象相关的方法
        Element getElementById(String id) 根据id获得唯一元素对象
        Elements getElementsByTag(String tagName)  根据标签名获得一组元素对象
        Elements getElementsByTag(String className)  根据class属性值获得元素对象


 - 需求：获取 index.html 中元素属性 id="footer"的一个元素并打印输出
 - 需求：获取 index.html 中所有 h3 标签名称的元素列表并打印输出
 - 需求：获取 index.html 中所有元素含有 class 属性值为 item 并打印输出
 */
public class Demo02 {
    // 文档对象
    private Document document;

    @Before
    public void init()throws Exception{
        // 获得URL对象
        URL url = Demo02.class.getResource("/index.html");
        // 获得资源文件的绝对路径
        String path = url.getPath();
        // System.out.println(path);
        // 创建文件对象
        File file = new File(path);
        // 获得文档对象
        document = Jsoup.parse(file, "utf-8");
    }

    // 需求：获取 index.html 中元素属性 id="footer"的一个元素并打印输出
    @Test
    public void test01() throws IOException {
        // 根据id获得元素对象
        Element footer = document.getElementById("footer");
        System.out.println(footer);
    }

    // 需求：获取 index.html 中所有 h3 标签名称的元素列表并打印输出
    @Test
    public void test02() throws IOException {
        // 根据标签名获得元素对象
        Elements elements = document.getElementsByTag("h3");
        // 输出元素对象
        elements.forEach(System.out::println);
    }

     // 需求：获取 index.html 中所有元素含有 class 属性值为 item 并打印输出
     @Test
     public void test03() throws IOException {
         // 根据class属性值获得元素对象
         Elements elements = document.getElementsByClass("item");
         // 输出元素对象
         elements.forEach(System.out::println);
     }
}
