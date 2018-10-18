package com.itheima._01Collection集合的概述;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/*
* 集合：
*     就是一个容器，可以存储多个数据。类似于数组。
*
*     数组的特点:
*        -- 数组的类型是确定的，数组的长度是固定的。
*        -- 数组是比较单一的，数组就是一种形式。
*
*     集合的特点：
*        -- 集合的类型是可以不固定的，集合的长度也是不固定的
*           集合中的元素多，集合就大，集合可以无限度的往里面添加元素。
*
*     开发中如果遇到了元素类型是确定的，并且元素个数也是确定的应该选择使用数组。
*     开发中经常出现元素的个数是不确定的，而且经常需要增删元素，这个时候应该选择集合。
*     开发中集合用的最多！
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
* 其实开发中List系列集合用的相对是比较多的，因为开发中的很多元素是会重复的，而且是需要保留顺序的，
* 有索引操作起来也更加的方便。
*
* 今天以 ArrayList 集合来研究Collection集合的使用。
* 因为Collection集合的功能是所有集合都可以使用的。
*
*/
public class CollectionDemo01 {
    public static void main(String[] args){
        // ArrayList : 有序可重复，有索引的
        Collection lists = new ArrayList();
        lists.add("Java");
        lists.add("Java");
        lists.add("Java EE");
        lists.add(100);
        lists.add(100);
        lists.add(true);
        lists.add('中');
        System.out.println(lists);

        // HashSet :无序，不重复。
        Collection sets = new HashSet();
        sets.add("Java");
        sets.add("Java");
        sets.add("Java EE");
        sets.add(100);
        sets.add(100);
        sets.add(true);
        sets.add('中');
        System.out.println(sets);
    }
}
