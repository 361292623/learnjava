package com.itheima._02常用函数式接口Function详解;

import java.util.function.Function;

/*
* Stringstr="赵丽颖,20";
*
    1. 将字符串截取数字年龄部分，得到字符串；
    2. 将上一步的字符串转换成为int类型的数字；
    3. 将上一步的int数字累加100，得到结果int数字。

*
*
* */
public class FunctionExecDemo03 {
    public static void main(String[] args) {
        // 1. 将字符串截取数字年龄部分，得到字符串；
        Function<String,String> p1 = s -> s.split(",")[1];
        // 2. 将上一步的字符串转换成为int类型的数字；
        Function<String,Integer> p2 = Integer::valueOf;
        // 3. 将上一步的int数字累加100，得到结果int数字。
        Function<Integer, Integer> p3 = s -> s + 100 ;

        String str ="赵丽颖,20";
        Integer rs = p1.andThen(p2).andThen(p3).apply(str);
        System.out.println(rs);

    }

}
