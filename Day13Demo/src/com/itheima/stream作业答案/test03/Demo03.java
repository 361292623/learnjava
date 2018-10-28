package com.itheima.stream作业答案.test03;

import java.util.*;
import java.util.stream.Stream;

/**
 * 请分别创建List,Set,Vector,Map集合及数组，并获取流。
 */
public class Demo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Vector<String> vector = new Vector<>();
        Stream<String> stream3 = vector.stream();

        Map<String, String> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<String> valueStream = map.values().stream();
        Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream();

        String[] array = {"东邪", "西毒", "南帝", "北丐", "中神通"};
        Stream<String> stream4 = Stream.of(array);
        Stream<String> stream5 = Arrays.stream(array);
    }
}
