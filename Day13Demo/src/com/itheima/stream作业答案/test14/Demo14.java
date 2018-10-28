package com.itheima.stream作业答案.test14;

import java.util.ArrayList;
import java.util.List;

/**
 * 已知有一个集合，包含如下因素："黄药师", "冯蘅", "郭靖","黄蓉", "郭芙", "郭襄","郭破虏"
 * <p>
 * 1. 首先筛选所有姓郭的人；
 * 2. 然后筛选名字有二个字的人；
 * 3. 最后进行对结果进行打印输出。
 */
public class Demo14 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("黄药师");
        list.add("冯蘅");
        list.add("郭靖");
        list.add("黄蓉");
        list.add("郭芙");
        list.add("郭襄");
        list.add("郭破虏");
        list.stream().filter(s -> s.startsWith("郭"))
                .filter(s -> s.length() == 2).forEach(System.out::println);
    }
}
