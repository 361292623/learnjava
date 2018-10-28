package com.itheima._08方法引用_特定类型的实例方法引用;

import java.util.Arrays;
import java.util.Comparator;

/*
* 方法引用：
*     只能简化Lambda表达式的代码。
*     必须先有Lambda表达式代码，才存在方法引用的简化。
*
*     lambda ==> 简化函数式接口的匿名内部类创建对象的代码。
      方法引用 ==> 简化lambda表达式的代码。

      函数式接口 -> Lambda表达式 -> 方法引用。

 方法引用的分类
    * 1.静态方法引用
    * 2.对象方法引用
    * 3.特定类型实例方法引用
    * 4.构造器引用

 方法引用方案三：特定类型方法的引用
        特定类型实例方法引用格式：类名::非静态方法引用
        特定类型实现方法引用注意事项
         -- 被引用的方法参数列表要比函数式接口中的抽象方法的参数列表少一个参数。
         -- 被引用的方法是由lambda表达式中的第一个参数对象调用，
           其余参数作为被引用方法的参数传递。
*
*
*
* */
public class TypeMethodYinyongDemo01 {
    public static void main(String[] args) {
        String[] names = { "James", "AA", "John","aa",
                "Patricia", "Robert","Dlei","Xlei", "Blue" , "black" , "Michael", "Linda"};

        // 对数组中的元素进行首字母排序。
        /*
        * 参数一：被排序的数组
        * 参数二：排序规则
        */
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // compareToIgnoreCase:忽略大小写进行首字母排序。
                // 忽略大小写
                // o1的首字母如果大于o2的首字母返回正数
                // o1的首字母如果小于o2的首字母返回负数
                // o1的首字母如果等于o2的首字母返回零
                return o1.compareToIgnoreCase(o2);
            }
        });

        Arrays.sort(names, ( o1,  o2) -> {
                return o1.compareToIgnoreCase(o2);
        });

        Arrays.sort(names, ( o1,  o2) -> o1.compareToIgnoreCase(o2)) ;

        // 特定类型的方法的引用：
        // 特定类型：String
        // 方法： compareToIgnoreCase
        Arrays.sort(names, String::compareToIgnoreCase) ;

        System.out.println(Arrays.toString(names));
    }
}
