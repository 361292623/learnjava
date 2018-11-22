package com.itheima._03xml解析案例;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
     利用 jsoup 的知识，将 contact.xml 文件中的联系人数据封装成集合，
     其中每个元素是实体类 Contact。打印输出 List 中的每个元素。

     Element元素常用方法
         String attr("属性名")
            得到元素指定属性的值
         Elements children()
            得到元素的所有子元素对象，返回集合
         String tagName()
            得到元素的标签名称
         String text()
            得到元素主体内容中的文本
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        // 创建文档对象
        Document document = Jsoup.parse(new File(Demo01.class.getResource("/contact.xml").getPath()), "utf-8");
        // 根据标签名获得所有contact元素对象
        Elements contactElements = document.getElementsByTag("contact");

        // 创建集合对象存储联系人对象
        List<Contact> contacts = new ArrayList<>();
        // 遍历集合
        for (Element contactElement:contactElements) {
            /*
            contactElement元素就对应下面标签
                <contact id="SB100">
                    <name>潘金莲</name>
                    <gender>女</gender>
                    <phone>10010</phone>
                    <qq>10086</qq>
                    <email>10086@qq.com</email>
                </contact>
             */
            // 创建联系人对象
            Contact contact = new Contact();

            // 根据id名获得属性值
            String id = contactElement.attr("id");
            contact.setId(id);

            // 获得Class对象
            Class c = contact.getClass();

            // 获得当前元素contactElement所有的子元素对象
            Elements childElements = contactElement.children();
            // 遍历子元素对象
            for (Element childElement : childElements) {
                // 获得标签体的内容  '潘金莲'
                String value = childElement.text();
                // 获得元素名称(就是Contact类的成员变量名)
                String tagName = childElement.tagName(); // name
                // 根据元素名获得Field对象
                // 每一个成员变量都对应一个Field的对象
                // 每一个成员方法都对应一个Method的对象
                Field field = c.getDeclaredField(tagName);
                // 暴力反射
                field.setAccessible(true);
                // 给成员变量field赋值
                field.set(contact, value);
                // System.out.println(childElement.tagName()+"="+childElement.text());
            }
            // 将联系人对象添加集合中
            contacts.add(contact);
        }

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
