package com.itheima._02jsoupxpath;

import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.util.List;

/**
    JsoupXpath之相对路径表达式案例
    相对路径表达式语法：
        子元素/孙元素
        /子元素/孙元素
        ./子元素/孙元素


    需求：先采用绝对路径获取 body 节点，再采用相对路径获取下一级 div 节点列表并打印信息。
 */
public class Demo03 {
    public static void main(String[] args)throws Exception{
        // 获得文档对象
        Document document = Jsoup.parse(
                new File(Demo02.class.getResource("/index.html").getPath()),
                "utf-8");
        // 根据文档对象获得JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        // 使用绝对路径获得body节点对象
        JXNode bodyNode = jxDocument.selNOne("/body");
        // 相对路径表达式
        String xpath = "div/ul/li";
        // 根据路径表达式获得元素对象，返回集合
        List<JXNode> jxNodes = bodyNode.sel(xpath);
        jxNodes.forEach(System.out::println);
    }

}
