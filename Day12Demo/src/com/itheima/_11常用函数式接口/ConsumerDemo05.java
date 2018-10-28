package com.itheima._11常用函数式接口;

import java.util.function.Consumer;

/*
* Consumer的题目：
*
数组：
    String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
要求是：
   输出： 姓名=迪丽热巴 性别=女
   输出： 姓名=古力娜扎 性别=女
   输出： 姓名=马尔扎哈 性别=男
*
*
* */
public class ConsumerDemo05 {
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };

        Consumer<String> c1 = s -> System.out.print("姓名="+s.split(",")[0] +"\t");
        Consumer<String> c2 = s -> System.out.println("性别="+s.split(",")[1] +"\t");

        for(String data : array){
            //函数式编程
            c1.andThen(c2).accept(data);
        }
    }


}
