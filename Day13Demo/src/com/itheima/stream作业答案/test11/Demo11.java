package com.itheima.stream作业答案.test11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

/**
 请分别写出获取并发流的两种方式。
 */
public class Demo11 {
    public static void main(String[] args){
        // 方式一
        Collection<String> coll = new ArrayList<>();
        Stream<String> stream = coll.parallelStream();

        // 方式二
        Stream.of(100,200,300,400,500).parallel()
                .forEach(System.out::println);
    }
}
