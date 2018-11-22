package com.itheima._02jsoupxpath;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
    JsoupXpath之绝对路径表达式案例
    绝对路径表达式语法：/子元素/孙元素

    需求： 采用绝对路径获取从根节点开始逐层的/body/div/ul/li 节点列表并打印信息

 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        // 获得文档对象
        Document document = Jsoup.parse(
                 new File(Demo02.class.getResource("/index.html").getPath()),
                "utf-8");
        // 根据文档对象获得JXDocument对象
        JXDocument jxDocument = new JXDocument(document);

        // 使用绝对路径表达式查找元素对象
        List<JXNode> jxNodes = jxDocument.selN("/body/div/ul/li");
        // 遍历输出节点对象
        jxNodes.forEach(System.out::println);
    }
}
