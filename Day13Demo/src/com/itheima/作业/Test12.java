package com.itheima.作业;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test12 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("100","200","300","400","500");
        List<String> list = stream.collect(Collectors.toList());
        Set<String> set = stream.collect(Collectors.toSet());
        String[] strings = stream.toArray(String[]::new);
    }
}
