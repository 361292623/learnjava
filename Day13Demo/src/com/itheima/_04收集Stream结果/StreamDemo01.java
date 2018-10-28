package com.itheima._04收集Stream结果;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* 集合：
*   Stream思想 : 把集合转换成Stream流 -> 然后通过操作Stream流
*   达到操作集合元素的目的。
*
*   Stream流操作完成以后，依然是Stream流。但是操作完毕以后
*   数据不应该在Stream上了，应该从新回到集合中去。
*
*   所以Stream流很有必要又转换成集合：收集Stream流的结果。
*
*   “Stream流是手段，Stream流是操作集合的，最终的集合才是目的”
* */
public class StreamDemo01 {
    public static void main(String[] args) {
        //对流操作完成之后，如果需要将其结果进行收集，例如获取对应的集合、数组等，如何操作？
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("周伯通");
        list.add("孙悟空");
        list.add("赵敏");
        list.add("金毛狮王");
        list.add("张强");
        list.add("张三丰");
        list.add("周星驰");
        list.add("周星驰");

        Stream<String> stream = list.stream().filter(s -> s.length() >= 3)
                .filter(s -> s.startsWith("周"));

       // Stream流 => 集合
       // Stream流 => 数组
        // 只能收集一次
       /*
        List<String> lists1 = stream.collect(Collectors.toList());
        System.out.println(lists1);*/

        /*Set<String> sets1 =  stream.collect(Collectors.toSet());
        System.out.println(sets1);*/


      /*
        // 默认返回Object类型的数组。
        Object[] arrs =  stream.toArray();
        System.out.println(Arrays.toString(arrs));*/

        // 转换成指定类型的数组
        // 参数：说明最终流转换后的数组类型
        String[] strArray = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(strArray));
    }
}
