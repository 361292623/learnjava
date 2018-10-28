package com.itheima.stream作业答案.test09;

import java.util.stream.Stream;

/**
 已知当前Stream流中有如下元素：郭靖，杨康，另一个Stream流中有如下元素：黄蓉，穆念慈，请将二者合并为一个Stream流。
 */
public class Demo09 {
    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("郭靖", "杨康");
        Stream<String> streamB = Stream.of("黄蓉", "穆念慈");
        Stream<String> result = Stream.concat(streamA, streamB);
    }
}
