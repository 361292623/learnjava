package com.itheima.stream作业答案.test04;

import java.util.stream.Stream;

/**
 * Stream中有如下7个元素：黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，请将以郭字开头的元素筛选出来。
 */
public class Demo04 {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        Stream<String> result = original.filter(s -> s.startsWith("郭"));
    }
}
