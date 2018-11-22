package com.itheima._02jsoupxpath;

import cn.wanghaomiao.xpath.model.JXDocument;
import com.itheima._01jsoup.Demo02;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

/**
    JsoupXpath之获得JXDocument对象
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        // 获得文档对象
        Document document = Jsoup.parse(
                 new File(Demo01.class.getResource("/index.html").getPath()),
                "utf-8");
        // 根据文档对象获得JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        System.out.println(jxDocument);

    }
}
