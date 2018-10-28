package com.itheima._01常用函数式接口Predicate详解;

import java.util.function.Predicate;

/*
  String[]array={"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"}
  1. 必须为女生；
  2. 姓名为4个字。

  分析条件有几个：
      两个条件，与关系

  思路：
     给你一个数组
     遍历集合中的每个元素
     然后用两个条件去校验。
*
*
* */
public class PredicateExecDemo05 {
    public static void main(String[] args) {
        String[] array= {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};
        filter( s -> s.split(",")[1].equals("女") ,
                s -> s.split(",")[0].length()==4 , array);

    }

    public static void filter(Predicate<String> p1 , Predicate<String> p2 , String[] arrs){
        for(String data : arrs){
            if(p1.and(p2).test(data)){
                System.out.println(data);
            }
        }
    }
}
