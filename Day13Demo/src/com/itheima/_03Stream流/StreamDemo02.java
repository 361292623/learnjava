package com.itheima._03Stream流;

import java.util.*;
import java.util.stream.Stream;

/*
* 获取Stream流：
*
* Stream流是为了简化集合或者数组的操作。
* 本案例讲解各种集合获取Stream流的方式。
*
* 注意：因为Stream流上的数据全部是集合的元素，所以Stream流的泛型
*      类型与集合的元素类型必须完全一致。
* 获取流的方式：
*      1.集合直接调用自己的stream()方法，得到自己的Stream流。
*      2.数组获取Stream流：
*        Stream<String> ssStream1 = Arrays.stream(array);
         Stream<String> ssstream2 = Stream.of(array);
*
* */
public class StreamDemo02 {
    public static void main(String[] args) {
        // Collection集合
        Collection<String> cls = new ArrayList<>();
        Stream<String> clsStream = cls.stream();

        List<Integer> lists = new ArrayList<>();
        Stream<Integer> listsStream = lists.stream();

        Set<String> sets = new HashSet<>();
        Stream<String> setsStream = sets.stream();

        // 根据Map获取流
        Map<String,Integer> maps = new HashMap<>();
        // 获取键的Stream
        Stream<String> keyStrems = maps.keySet().stream();

        // 获取值的Stream流
        Stream<Integer> valueStrems = maps.values().stream();

        // 获取键值对的Stream
       /* Set<Map.Entry<String,Integer>> sets1 = maps.entrySet();
        Stream<Map.Entry<String,Integer>> kvStreams = sets1.stream();*/

        Stream<Map.Entry<String,Integer>> kvStreams = maps.entrySet().stream();

        // 根据数组获取流
        String[] array = { "张无忌", "张翠山", "张三丰", "张一元" };
        Stream<String> ssStream1 = Arrays.stream(array);
        // ssStream1.forEach(System.out::println);
        Stream<String> ssstream2 = Stream.of(array);
    }
}
