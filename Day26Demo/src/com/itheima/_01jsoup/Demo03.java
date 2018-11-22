package com.itheima._01jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URL;

/**

    jsoup获得元素对象-- 使用css选择器获取

    Document类与获得元素对象相关的方法(CSS选择器)
        Elements select(String cssQuery);
        Elment selectFirst(String cssQuery);

 - 需求：获取 index.html 中id="footer"元素并输出元素名称
 - 需求：获取 index.html 中所有元素含有 class 属性值为 item 并打印输出元素名称
 - 需求：获取 index.html 中所有 h3 标签名称的元素列表并打印输出元素名称
 - 需求：获取 index.html 中属性 role 值为"tablist"的所有元素列表并打印输出元素名称
 */
public class Demo03 {
    // 文档对象
    private Document document;

   /* @Before
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


    // 需求：获取 index.html 中id="footer"元素并输出元素名称
    @Test
    public void test01()throws Exception{
        // 根据id选择器获得一组元素对象
        Element element = document.selectFirst("#footer");
        System.out.println(element);
    }

    // 需求：获取 index.html 中所有元素含有 class 属性值为 item 并打印输出元素名称
    @Test
    public void test02()throws Exception{
        // 根据类选择器获得一组元素对象
        Elements elements = document.select(".item");
        System.out.println(elements);
    }

    // 需求：获取 index.html 中所有 h3 标签名称的元素列表并打印输出元素名称
    @Test
    public void test03()throws Exception{
        // 根据标签选择器获得一组元素对象
        Elements elements = document.select("h3");
        System.out.println(elements);
    }

    //  需求：获取 index.html 中属性 role 值为"tablist"的所有元素列表并打印输出元素名称
    @Test
    public void test04()throws Exception{
        // 根据属性选择器获得一组元素对象
        Elements elements = document.select("[role=tablist]");
        System.out.println(elements);
    }
*/
}
