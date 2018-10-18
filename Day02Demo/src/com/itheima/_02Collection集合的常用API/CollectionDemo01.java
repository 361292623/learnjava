package com.itheima._02Collection集合的常用API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
/*

集合的常用API:
    public boolean add(E e) 添加元素
    public void clear()     清空集合中的元素
    boolean remove(E e)     删除指定的元素，删除成功返回true，否则false,只删除第一次出现的元素。
    boolean contains(E e)   判断集合中是否包含指定的元素，包含返回true，否则false
    public boolean isEmpty()  判断集合是否为空(元素个数是否等于零)，为空返回true，否则false
    public int size()       获得集合元素的个数
    public Object[] toArray()  将集合转换为数组
*
*/
public class CollectionDemo01 {
    public static void main(String[] args){
        Collection lists = new ArrayList();
        // 添加元素
        lists.add("Java");
        lists.add("Java EE");
        lists.add("Java EE");
        lists.add(true);
        lists.add(98.9);

        System.out.println(lists);

        // 清空集合
        //lists.clear();
        //System.out.println(lists);

        // 集合的元素个数：集合的大小。
        System.out.println(lists.size());

        // 是否包含某一个元素，包含返回true , 反之
        System.out.println(lists.contains("Java"));

        // 删除某个元素,删除第一个出现的元素，删除成功返回true
        System.out.println(lists.remove("Java EE"));
        System.out.println(lists);


        // 判断集合是否为空，为空返回true
        System.out.println(lists.isEmpty());

        // 把集合转成数组,集合的全部元素会转移到数组中去
        Object[] objs = lists.toArray();
        System.out.println("objs:"+ Arrays.toString(objs));

        // -----------------------------------------
        System.out.println("----------------------");
        Collection c1 = new ArrayList();
        c1.add("Java");
        c1.add("Mysql");

        Collection c2 = new ArrayList();
        c2.add("Oracle");
        c2.add("Mysql");

        // 把c2集合中的全部元素倒入到c1集合中去。
        // （并集）
        c1.addAll(c2);
        System.out.println(c1);


    }
}
