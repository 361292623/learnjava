package com.itheima._03Set集合的详细使用;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/*
  LinkedHashSet:
* 继承HashSet，能够保证存取顺序一致。
* 有序，不重复。
* 底层结构是哈希表(数组+链表+哈希算法+红黑树) + 链表（有序机制）
*
*
*/
public class LinkedHashSetDemo04 {
    public static void main(String[] args) {
        Set<String> sets = new LinkedHashSet<>();
        sets.add("Java");
        sets.add("Java");
        sets.add("Java EE");
        sets.add("Java EE");
        sets.add("Oracle");
        sets.add("Spring Boot");
        System.out.println(sets);
    }
}
