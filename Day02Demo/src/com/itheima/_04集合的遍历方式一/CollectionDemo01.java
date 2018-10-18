package com.itheima._04集合的遍历方式一;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/*
* Collection集合的遍历方式：
*    总共有三种：
*    （1） 使用Collection集合的迭代器遍历集合。
*    （2） 使用foreach（增强for循环）遍历集合
*    （3） JDK 1.8 以后使用的Lambda表达式遍历集合（了解）
*
* 为什么要遍历?
*     开发中很多的数据都是放在一个容器中（集合，数组）存储和操作的。
*     假如要从这些数据中找出某一个数据，那么就必须一个一个的去寻找
*
* 集合的第一种遍历方式：使用Collection集合的迭代器遍历集合
*     Iterator<E> iterator()
*     遍历过程：
*        （1） 获取当前被遍历集合的迭代器
*               Iterator<String> it = lists.iterator();
*        （2） 定义一个循环
*             先通过it.hasNext()询问是否有下一个元素。如果有返回true
*             循环会进入到代码中去通过it.next()取出下一个元素
*             如果it.hasNext()返回的是false,说明元素已经没有了
*             循环结束。
*    注意：
 *    java.util.NoSuchElementException：没有元素异常
 *    如果没有元素可迭代了仍然调用next方法获得元素，则会抛出该异常。
 *
 *    1. 屏蔽了众多集合的内部实现，对外提供统一的遍历方式。
      2. 只要是单列集合都可以使用迭代器遍历
*
* */
public class CollectionDemo01 {
    public static void main(String[] args){
        Collection<String> lists = new ArrayList<>();
        lists.add("Java");
        lists.add("Java EE");
        lists.add("Oracle");
        lists.add("Mysql");
        lists.add("Spring Boot");
        System.out.println(lists);
        // lists = [Java, Java EE, Oracle, Mysql, Spring Boot]
        //                                           it

        // 集合的第一种遍历方式：使用Collection集合的迭代器遍历集合
        // （1）获取当前被遍历集合的迭代器。（每个集合sun公司都为他提供了迭代器）
        //   迭代器的泛型类型必须与集合的元素类型一致。
        //   集合的迭代器是通过集合调用自己的Iterator<E> iterator()方法得到的。
        Iterator<String> it = lists.iterator();
        // （2）开始去遍历 ：依次获取下一个元素
        // String ele = it.next();
        /*System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/
        // System.out.println(it.next()); 已经到头了！不能继续找！

        // lists = [Java, Java EE, Oracle, Mysql, Spring Boot]
        // it
        // (2)it.hasNext()每次都会去询问是否有下一个元素，有就返回true,没有返回false循环结束。
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
