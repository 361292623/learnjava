package com.itheima._02jsoupxpath;

import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.util.List;

/**
    JsoupXpath之全文搜索案例
    全文搜索语法：
        //子元素
        //子元素/孙元素/@属性名


     需求：
     1. 直接全文搜索所有的 li 元素列表并打印
     2. 直接全文搜索所有的 div,再逐层级搜索下面的 a 元素下的 img 元素列表并打印
     3. 直接获取 link 元素里面 href 属性的值，注意属性要用@符号

 */
public class Demo04 {
    public static void main(String[] args)throws Exception{
        // 获得文档对象
        Document document = Jsoup.parse(
                new File(Demo02.class.getResource("/index.html").getPath()),
                "utf-8");
        // 根据文档对象获得JXDocument对象
        JXDocument jxDocument = new JXDocument(document);

        // 1. 直接全文搜索所有的 li 元素列表并打印
        List<JXNode> jxNodes = jxDocument.selN("//li");
        // jxNodes.forEach(System.out::println);

        // 2. 直接全文搜索所有的 div,再逐层级搜索下面的 a 元素下的 img 元素列表并打印
        List<JXNode> jxNodes1 = jxDocument.selN("//div/a/img");
        // jxNodes1.forEach(System.out::println);

        // 3. 直接获取 link 元素里面 href 属性的值，注意属性要用@符号
        List<JXNode> jxNodes2 = jxDocument.selN("//link/@href");
        jxNodes2.forEach(System.out::println);
    }

}
