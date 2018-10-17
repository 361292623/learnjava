package com.itheima._02List集合的详细介绍;

import java.util.LinkedList;
import java.util.List;

/*
* LinkedList集合：
*    实现了List接口
     有序(存取顺序一致)，有索引，元素可重复
     底层是双链表结构，”查询慢“，”增删快“，线程不安全的，效率高
*
* LinkedList集合特有方法方法：
*   因为双链表结构，首尾元素是可以直接定位的。
*   所以LinkedList集合操作首位元素的性能极好，所以
*   LinkedList集合提供了很多的首位操作的API:
*
*   public void addFirst(E e):  将元素添加到链表头
    public void addLast(E e):   将元素添加到链表尾部
    public E getFirst():         获得链表头元素
    public E getLast():          获得链表尾部元素
    public E removeFirst():      删除链表头元素
    public E removeLast():       删除链表尾部元素
*
*   LinkedList集合是可以用来设计队列和栈的。
*
*   如果需要执行大量的增删操作，则选择LinkedList。
    如果不需要执行增删操作，而存在查询操作，则选择ArrayList
*
*   开发ArrayList集合用的最多。
*/
public class LinkedListDemo03 {
    public static void main(String[] args){
        // 排队结构，存储每个人的，先进先出。
        // 做队列：
        LinkedList<String> lists = new LinkedList<>();

        //lists.get(3);

        // 入队。
        lists.addLast("张三");
        lists.addLast("李四");
        lists.addLast("王五");
        lists.addLast("王麻子");

        // 出队：移出第一个。
        System.out.println(lists.removeFirst());
        System.out.println(lists.removeFirst());
        System.out.println(lists);

        // 做：栈
        System.out.println("---------------------------------");
        LinkedList<String> zhans = new LinkedList<>();
        // 入栈 压栈
        zhans.addFirst("第一个子弹");
        zhans.addFirst("第二个子弹");
        zhans.addFirst("第三个子弹");
        zhans.addFirst("第四个子弹");
        // 出栈，弹栈
        System.out.println(zhans.removeFirst());
        System.out.println(zhans.removeFirst());
        System.out.println(zhans.removeFirst());
    }
}
