package com.itheima.函数式接口作业答案.test04;

import java.util.function.Function;

/**
 请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：

 1. 将字符串"赵丽颖,20"截取数字年龄部分；
 2. 将上一步的字符串转换成为int类型的数字；
 3. 将上一步的int数字累加100，得到结果int数字。

 */
public class Test04 {
    public static void main(String[] args){
        String str = "赵丽颖,20";
        func(str,s -> s.split(",")[1],Integer::parseInt ,s -> s += 100);
    }

    public static void func(String str, Function<String,String> one,
                            Function<String,Integer> two,
                            Function<Integer,Integer> three){
        int result = one.andThen(two).andThen(three).apply(str);
        System.out.println(result);
    }
}
