package com.itheima._03Set集合的详细使用;

import java.util.HashSet;
import java.util.Set;

/*
    Set集合特征研究：
 *  1.为什么元素是可以实现不重复的 ?
 *     a.如果Set集合中的元素是基本数据类型，Set集合自己就会直接比较得到是否重复的结果
 *       然后去掉一个重复的。
 *
 *     b.如果Set集合中的元素是引用数据类型，如果比较两个对象是否重复呢？
 *       每次给Set集合添加引用对象的时候。
 *       Set集合先会两两比较，然后让对象调用自己的hashCode()方法获得一个所谓的
 *       内存地址(哈希值),然后判断两个对象的哈希值是否相等，
 *       如果哈希值不相等，认为两个对象不重复。
 *       如果哈希值相等，Set集合会继续让两个对象进行equals比较。
 *       如果比较相等，认为两个对象重复了。
 *       如果不相等认为两个对象不重复了。
 *
 *       写以下流程：
 *          先调用两个对象的hashCode()方法判断哈希值是否一样
 *          /                            \
 *         false                         true
 *         /                              \
 *        不重复                        继续判断两个对象的equals方法
 *                                      /         \
 *                                    false       true
 *                                    /            \
 *                                   不重复        重复了
 *
 *   hashCode()方法和equlas存在的意义就是为了被重写，以便
 *   程序员自己来指定重复规则。
 */
public class SetDemo02 {
    public static void main(String[] args){
        Apple a1 = new Apple("红富士","红色",502.29);
        Apple a2 = new Apple("红富士","红色",502.29);
        Apple a3 = new Apple("水晶","绿色",303.8);

      /*
        System.out.println(a1.hashCode()); // 返回对象的哈希值(所谓的内存地址)
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());*/

        Set<Apple> apps = new HashSet<>();
        apps.add(a1);
        apps.add(a2);
        apps.add(a3);
        System.out.println(apps);

    }
}
