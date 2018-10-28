package com.itheima._03Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
*   tream流：
*   说到Stream便容易想到I/O Stream，而实际上，谁规定“流”就一定是“IO流”呢?
*   在Java 8中，得益于Lambda所带来
*   的函数式编程，引入了一个全新的Stream概念，用于解决已有集合类库既有的弊端。

*   Stream流是JDK 1.8之后的新技术
*   是流式编程的核心，是函数式编程的核心。
*   核心功能：用于解决已有集合类库或者数组既有的弊端。

*   先研究循环遍历集合的弊端。

*   然后使用Stream流简化： Stream流的初体验
*      核心思想：先获取集合的Stream流，然后用Stream流来操作集合的数据。
*      Stream流实际上就是一个传送带。
*
*
* */
public class StreamDemo01 {
    public static void main(String[] args) {
        filter2();
    }

    // 2.Stream流的初体验
    public static void filter2(){
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("孙悟空");
        list.add("赵敏");
        list.add("金毛狮王");
        list.add("张强");
        list.add("张三丰");

        // 核心思想：
        // 先获取集合的Stream流
        // Stream流实际上就是一个传送带。
        Stream<String> listStream = list.stream();
        // 需求1：1.请筛选出姓名有三个字符的，成为一个新集合
        // 需求2：2.我需要姓张的人
        listStream.filter(s -> s.length() == 3)
                .filter(s -> s.startsWith("张"))
                .forEach(System.out::println);

    }

    // 1.循环遍历集合过滤的弊端。
    //  代码冗余，可读性差，操作麻烦！
    public static void filter1(){
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("孙悟空");
        list.add("赵敏");
        list.add("金毛狮王");
        list.add("张强");
        list.add("张三丰");

        // 需求1：1.请筛选出姓名有三个字符的，成为一个新集合
        List<String> threeLists = new ArrayList<>();
        for(String name : list){
            if(name.length() == 3){
                threeLists.add(name);
            }
        }

        for(String name : threeLists){
            System.out.println(name);
        }

        System.out.println("-------------------------");

        // 需求2：2.我需要姓张的人
        List<String> zhangLists = new ArrayList<>();
        for(String name : list){
            if(name.startsWith("张")){
                zhangLists.add(name);
            }
        }
        for(String name : zhangLists){
            System.out.println(name);
        }
    }
}
