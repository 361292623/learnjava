package com.itheima._03Stream流;

import java.util.ArrayList;
import java.util.List;

/*
* 非终结方法与终结方法
*    Stream流只能用一次。但是人家可以返回一个新的Stream流给你用。
*
*    在上述介绍的各种方法中，凡是返回值仍然为 Stream流 接口的为非终结方法
*    返回值不再为 Stream 接口的为终结方法
*
*    非终结方法依然会返回流给你继续使用。
*    终结方法一旦调用，说明这个流已经结束了，不能再继续使用。
*
*/
public class StreamDemo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("孙悟空");
        list.add("赵敏");
        list.add("金毛狮王");
        list.add("张强");
        list.add("张三丰");

      /*  Stream<String> listStream = list.stream();
        // 原来的Stream流已经挂了，返回了一个新的Stream流。
        Stream<String> newStream =  listStream.filter(s -> s.length() >=3);
        newStream.forEach(System.out::println);*/

        list.stream().filter(s -> s.length()>=3).filter(s -> s.startsWith("张"))
        .forEach(System.out::println);
    }
}
