package com.itheima.stream作业答案.test08;

import java.util.stream.Stream;

/**
 已知当前Stream流中有如下整数类型的元素 10，20，30，40，请将其转换为String类型的Stream流。
 */
public class Demo08 {
    public static void main(String[] args) {
        Stream<Integer> original = Stream.of(10, 20, 30, 40);
        Stream<String> stream = original.map(String::valueOf);
    }
}
