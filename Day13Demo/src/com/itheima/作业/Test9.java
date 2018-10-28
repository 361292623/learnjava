package com.itheima.作业;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test9 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("郭靖","杨康");
        Stream<String> stream2 = Stream.of("黄蓉","穆念慈");
        Stream<String> stream3 = Stream.concat(stream1,stream2);
        System.out.println(Arrays.toString(stream3.toArray()));
    }
}
