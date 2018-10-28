package com.itheima.函数式接口作业;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};

        List<String> list = fun(array,s->s.split(",")[1]
                .equals("女"),s -> s.split(",")[0].length()==4);
        for(String s : list){
            System.out.println(s);
        }
    }
    public static List<String> fun(String[] array,
                                   Predicate<String> p1 , Predicate<String> p2){
        List<String> list = new ArrayList<>();
        for(String str:array){
            if(p1.and(p2).test(str)){
                list.add(str);
            }
        }


        return list;
    }
}
