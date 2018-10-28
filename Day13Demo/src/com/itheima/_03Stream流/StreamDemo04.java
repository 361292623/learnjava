package com.itheima._03Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
* 组合：concat
* 如果有两个流，希望合并成为一个流，那么可以使用 Stream 接口的静态方法 concat
* static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
*
* */
public class StreamDemo04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("孙悟空");
        list.add("赵敏");
        list.add("金毛狮王");
        list.add("张强");
        list.add("张三丰");
        Stream<String> sStream1 = list.stream();

        String[] arrs = {"蜘蛛精","紫霞仙子"};

        Stream<String> sStream2 = Stream.of(arrs);

        // 合并流
        Stream<String> sStream3 = Stream.concat(sStream1,sStream2);
        System.out.println(sStream3.count());

    }
}

