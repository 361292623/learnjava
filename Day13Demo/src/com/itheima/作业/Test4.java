package com.itheima.作业;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        Stream<String> stringStream =
                Stream.of("黄药师","冯蘅","郭靖","黄蓉","郭芙","郭襄","郭破虏");
         String[]ss = stringStream.filter(s->s.startsWith("郭")).toArray(String[]::new);
        System.out.println(Arrays.toString(ss));
    }
}
