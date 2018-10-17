package com.itheima._05Collections集合操作工具类;

import java.text.CollationKey;
import java.util.*;

/*
* Collections工具类的使用：
*    Arrays不是数组，是操作数组的
*    Collections不是集合，是操作集合的。
*    工具类的方法基本上都是静态的。
*
* Collections静态方法：
*   （1）public static <T> boolean addAll(Collection<T> c , T... elements)
*      给集合添加元素。
*      支持所有集合的。
*      参数一：支持所有集合
*      参数二：支持加入可变参数的数据。
*
*   （2）public static void shuffle(List<?> list)
*      将集合中的元素乱序。
*      参数：是一个List集合
*      这个方法只能支持List集合
*
*   （3）public static <T> void sort(List<T> list)
*      将集合中的元素排序，默认是升序排序
*      参数：是一个List集合
*      这个方法只能支持List集合的排序
*      排序：大小顺序。
*      有序：添加顺序。
*
*
* */
public class CollectionsDemo01 {
    public static void main(String[] args){
        Collection<String> lists = new ArrayList<>();
      /*  lists.add("张三");
        lists.add("李四");
        lists.add("王五");
        lists.add("王麻子");*/
       // Collections.addAll(lists);
        Collections.addAll(lists,"张三","李四","王五","王麻子");
        Collections.addAll(lists,new String[]{"孙悟空","猪八戒"});
        System.out.println(lists);

        //(2)public static void shuffle(List<?> list)
        // 这个方法只能支持List集合，只能把List集合元素打乱顺序
        List<String> lists1 = new ArrayList<>();
        Collections.addAll(lists1,"张三","李四","王五","王麻子");
        Collections.shuffle(lists1); // 打乱顺序 ：洗牌
        System.out.println(lists1);

        /*
         * public static <T> void sort(List<T> list)
         *      将集合中的元素排序，默认是升序排序
         *      参数：是一个List集合
         *      这个方法只能支持List集合的排序
         *      排序：大小顺序。
         *      有序：添加顺序。
         *
         */
        List<Integer> lists2 = new ArrayList<>();
        lists2.add(12);
        lists2.add(12);
        lists2.add(5);
        lists2.add(19);
        lists2.add(19);
        lists2.add(111);
        lists2.add(89);
        Collections.sort(lists2); // 排序！
        System.out.println(lists2);
    }
}
