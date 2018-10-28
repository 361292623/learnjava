package com.itheima.stream作业答案.test07;

import java.util.stream.Stream;

/**
 已知Stream中有如下元素：陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、程英，请跳过前2个，并在控制台打印输出筛选后新Stream中元素的个数。
 */
public class Demo07 {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("陈玄风", "梅超风", "陆乘风", "曲灵风", "武眠风", "冯默风", "程英");
        Stream<String> result = original.skip(2);
        System.out.println(result.count()); // 5
    }
}
