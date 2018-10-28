package com.itheima._05并发流;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
* 并发流：（性能好）
*     Stream流如果理解成工厂的传送带，
 *    那么并发流就是有很多流水工人在筛选。
*
* 串行流：
*    刚刚例子中使用的都是串行流，即单线程执行的。
*    流的操作只是一个线程在处理的。
*
*    串行流：Stream流如果理解成工厂的传送带，
*    那么串行流就只有一个流水工人在筛选。
*
* 集合获取并发流的方式：
*    default Stream stream() ： 返回串行流

     并发流的获取有两种方式：
       1. 集合可以直接调用：default Stream parallelStream() ： 返回并发流
*      2. 先调用stream()得到串行流,然后调用parallel()得到并发流。
*
*
* */
public class StreamDemo01 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        // 1. 集合可以直接调用：default Stream parallelStream() ： 返回并发流
        Stream<String> bfStream = lists.parallelStream();
        // 2. 先调用stream()得到串行流,然后调用parallel()得到并发流。
        Stream<String> bfStream1 = lists.stream().parallel();
    }
}
