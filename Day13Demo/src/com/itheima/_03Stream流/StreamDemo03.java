package com.itheima._03Stream流;

import java.util.ArrayList;
import java.util.List;

/*
* Stream流的常用API:
* Stream流的常用方法：
*  (1) 过滤：filter
*        Stream<T> filter(Predicate<? super T> predicate);
*  (2) 统计个数：count
*        long count();
*  (3) 获取前几个：limit
*        Stream<T> limit(long maxSize);
*  (4) 跳过前几个：skip
*        Stream<T> skip(long n);
*  (5) 映射：map
*      有点难，很重要，很有用。
* */
public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("孙悟空");
        list.add("赵敏");
        list.add("金毛狮王");
        list.add("张强");
        list.add("张三丰");

        // (1) 过滤：filter
        list.stream().filter(s -> s.startsWith("张"))
                .forEach(System.out::println);

        System.out.println("---------------------");
        // (2)统计个数：count
        long nums = list.stream().filter(s -> s.length()==2).count();
        System.out.println(nums);
        // (3) 获取前几个：limit
        list.stream().filter(s -> s.length() >= 3).limit(4)
                .forEach(System.out::println);
        System.out.println("---------------------");
        // (4) skip 跳过前几个
        list.stream().filter(s -> s.length() >= 3).skip(2)
                .forEach(System.out::println);

        System.out.println("---------------------");
        /*
        * 映射：map
        *      有点难，很重要，很有用。
        *      map:会遍历Stream流中每个元素，然后为每个元素执行该功能！
        *
        * 需求：把所有的姓名前面都加上: "牛逼的"(功能)
        * */
        list.stream().map(s -> "牛逼的"+s).
                forEach(System.out::println);
        System.out.println("---------------------");

    }
}
