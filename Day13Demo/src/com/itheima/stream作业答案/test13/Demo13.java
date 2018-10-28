package com.itheima.stream作业答案.test13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 请通过Stream流的方式，将数组当中的元素"Java", "UI", "Python", "C++"添加（收集）到 List 集合当中，并在控制台打印输出
 */
public class Demo13 {
    public static void main(String[] args){
        String[] array = {"Java", "UI", "Python", "C++"};
        List<String> list = Stream.of(array).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }
}
