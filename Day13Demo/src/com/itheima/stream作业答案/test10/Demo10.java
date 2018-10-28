package com.itheima.stream作业答案.test10;

import java.util.stream.Stream;

/**
 已知Stream中有如下7个元素：黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，请将所有元素在控制台打印输出。
 */
public class Demo10 {
    public static void main(String[] args){
        Stream<String> stream = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        stream.forEach(System.out::println);
    }
}
