package com.itheima._03Set集合的详细使用;

import java.util.HashSet;
import java.util.Set;

/*
* Set系列集合：
* 2.元素为什么可以实现无序?
*
* Set集合是基于哈希表存储元素的。
*   在 JDK1.8之前，哈希表底层采用：数组+链表+哈希算法
*   在 JDK1.8之后，哈希表底层采用：数组+链表+红黑树+哈希算法
*
*  流程：
*     （1）先获取添加元素的哈希值
*     （2）用哈希值对底层数组求余得到的结果作为元素在底层数组中的索引位置
*     （3）如果该位置存在元素，则形成链表。
*          JDK 1.8以后如果链表数超过8开始使用红黑树。
*
*      所以Set集合元素无序的根本原因是因为使用了哈希表存储元素。
*
*/
public class SetDemo03 {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("Java");
        sets.add("Java");
        sets.add("Java EE");
        sets.add("Java EE");
        sets.add("Oracle");
        sets.add("Spring Boot");
        System.out.println(sets);
    }
}
