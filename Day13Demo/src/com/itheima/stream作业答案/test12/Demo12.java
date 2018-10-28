package com.itheima.stream作业答案.test12;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 Stream中有如下字符串类型的元素："100", "200", "300", "400", "500"，请将其分别转为List，Set，数组（泛型为String类型的数组）
 */
public class Demo12 {
    public static void main(String[] args){
        Stream<String> stream1 =
                Stream.of("100", "200", "300", "400", "500");
        List<String> list = stream1.collect(Collectors.toList());

        Stream<String> stream2 =
                Stream.of("100", "200", "300", "400", "500");
        Set<String> set = stream2.collect(Collectors.toSet());

        Stream<String> stream3 =
                Stream.of("100","200","300","400", "500");
        String[] strArray = stream3.toArray(String[]::new);
    }
}
