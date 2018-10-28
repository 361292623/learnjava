package com.itheima.stream作业答案.test05;

import java.util.stream.Stream;

/**
 * 已知Stream中有如下元素：柯镇恶、朱聪、韩宝驹、南希仁、张阿生、全金发、韩小莹，请统计出具体个数，并在控制台打印输出。
 */
public class Demo05 {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("柯镇恶", "朱聪", "韩宝驹", "南希仁", "张阿生", "全金发", "韩小莹");
        System.out.println(original.count()); // 7
    }
}
