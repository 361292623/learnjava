package com.itheima.函数式接口作业答案.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 数组当中有多条“姓名+性别”的信息如下，请通过Predicate接口的拼装
 将符合要求的字符串筛选到集合ArrayList中，需要同时满足两个条件：

 1. 必须为女生；
 2. 姓名为4个字。

 */
public class Test03 {
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        List<String> names = filter(array  // str = 迪丽热巴,女
                , str-> str.split(",")[1].equals("女")
                , str-> str.split(",")[0].length() == 4
        );
        System.out.println(names);
    }

    /**
     * 根据条件筛选数据
     */
    public static List<String> filter(String[] array, Predicate<String> one, Predicate<String> two) {
        // 创建集合
        List<String> list = new ArrayList<>();
        // 遍历数组
        for(String name:array) {
            if(one.and(two).test(name)) {
                // 将name添加到集合中
                list.add(name);
            }
        }
        return list;
    }
}
