package com.itheima._02List集合的详细介绍;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
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
 * List集合的详解：
 *     有序(存取顺序一致)，有索引，元素可重复，基于线性表结构
 *     增删慢，查询快，所以如果需要进行大量的查询操应该使用List系列集合。
 *
 * List集合因为多了索引所以多了很多按照索引操作的方法：
 *      public void add(int index, E element): 将指定的元素添加到指定的位置
        public E get(int index): 根据索引获得指定位置的元素
        public E remove(int index): 删除指定位置的元素，返回被删除的元素
        boolean remove(Object o): 删除指定的元素，删除成功返回true，否则false
        public E set(int index, E element): 将指定位置的元素修改为指定的值element
 */
public class ListDemo01 {
    public static void main(String[] args) {
        // 创建一个List集合
        // 这行代码几乎是一个经典，几乎所有项目都是这样写的。
        // 面向接口编程的思想
        List<String> lists = new ArrayList<>();
        lists.add("Java");
        lists.add("Java");
        lists.add("Java EE");
        lists.add("Oracle");
        System.out.println(lists);

        // 在某个索引位置处插入一个新元素
        lists.add(2,"Spring");
        System.out.println(lists);

        // 根据索引获取元素
        System.out.println(lists.get(2));

        // 根据索引删除元素,删除成功返回被删除的元素给你。
        System.out.println(lists.remove(2));
        // 直接删除该元素
        System.out.println(lists.remove("Java"));
        System.out.println(lists);

        // 修改某个索引处的元素
        System.out.println(lists.set(2,"MySql"));
        System.out.println(lists);
    }
}
