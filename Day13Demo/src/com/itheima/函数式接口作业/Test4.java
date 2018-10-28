package com.itheima.函数式接口作业;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
        String s = "赵丽颖，20";
        Function<String,String> function1 =s1 -> s1.split("，")[1];
        Function<String,Integer> function2 =s1 -> Integer.valueOf(s1);
        Function<Integer,Integer> function3 =s1 -> s1+100;

        int ss = function1.andThen(function2).andThen(function3).apply(s);
        System.out.println(ss);

    }



}
