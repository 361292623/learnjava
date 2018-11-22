package com.itheima._02jsoupxpath;

import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.util.List;

/**
    JsoupXpath之条件搜索

     //元素[@属性名=值]
        获取元素"属性名=值"的所有元素

     //元素[@属性名>值]/@属性名
        获取元素"属性名>值"的所有元素的属性值

     //元素[@属性名=值]/text()
        获取符合条件元素的文本数据

     //元素[@属性名=值]/html()
        获得符合条件元素的html数据


 需求
 1. 搜索 li，属性为 class="nav-active"的元素并打印
 2. 搜索 li，属性为 data-slide-to 大于 0 的元素，再查询 data-slide-to 的属性值
 3. 搜索 a 标签，属性为 href="login.html"的元素，得到它的文本。
 */
public class Demo05 {
    public static void main(String[] args)throws Exception{
        // 获得文档对象
        Document document = Jsoup.parse(
                new File(Demo02.class.getResource("/index.html").getPath()),
                "utf-8");
        // 根据文档对象获得JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        // 1. 搜索 li，属性为 class="nav-active"的元素并打印
        // 注意：属性值如果不是数字则需要使用单引号括起来，不能使用双引号。
        List<JXNode> jxNodes = jxDocument.selN("//li[@class='nav-active']");
        // jxNodes.forEach(System.out::println);

        //  2. 搜索 li，属性为 data-slide-to 大于 0 的元素，再查询 data-slide-to 的属性值
        List<JXNode> jxNodes1 = jxDocument.selN("//li[@data-slide-to > 0]/@data-slide-to");
        // jxNodes1.forEach(System.out::println);

        //  3. 搜索 a 标签，属性为 href="login.html"的元素，得到它的文本。
        List<JXNode> jxNodes2 = jxDocument.selN("//a[@href='login.html']/text()");
        jxNodes2.forEach(System.out::println);


    }

}
