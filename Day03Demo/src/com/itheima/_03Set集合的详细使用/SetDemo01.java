package com.itheima._03Set集合的详细使用;

import java.util.HashSet;
import java.util.Set;

/*
*
 * Java中集合的代表是Collection.
 * Collection代表Java中所有的单列集合（是所有集合的祖宗类）
 *
 *                    Collection<E>(集合的规范，是一个接口)
 *                    /                              \
 *               List<E>(接口)                        Set<E>(接口)
 *               /           \                        \
 *       ArrayList<E>(实现类)  LinkedList<E>实现类)     HashSet<E>(实现类)
 *                                                     \
 *                                                     LinkedHashSet<E>(实现类)
 * 集合的使用特点：
 *       List系列集合的特点：添加的元素是有序可重复，有索引的。（很像数组）
 *          -- ArrayList<E>(实现类)： 有序可重复，有索引的
 *          -- LinkedList<E>实现类)： 有序可重复，有索引的
 *
 *       Set系列集合的特点：添加的元素是无序，不重复，无索引的。
 *          -- HashSet<E>(实现类) ： 无序，不重复。
 *          -- LinkedHashSet<E>(实现类)： 有序，不重复。
 *
 *   Set系列集合的特点：添加的元素是无序，不重复，无索引的,
 *      增删改查性能都挺好的。
 *
 */
public class SetDemo01 {
    public static void main(String[] args){
        // 规范写法：
        // 无序，不重复
        // 面试： 2.为什么可以实现无序?
        //       1.为什么元素是可以实现不重复的?
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
