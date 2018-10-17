package com.itheima._05Collections集合操作工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
*    （3）public static <T> void sort(List<T> list)
 *      将集合中的元素排序，默认是升序排序
 *      参数：是一个List集合
 *      这个方法只能支持List集合的排序
 *      排序：大小顺序。
 *      有序：添加顺序。
 *
 *   （4）public static <T> void sort(List<T> list, Comparator<? super T> c)
 *        参数一：需要被排序的集合
 *        参数二：自定义比较规则对象:比较器。
 *
 *    注意：对于数值类型的集合sort方法可以直接自动的升序排序。
 *        对于引用数据类型，sort不能排序，原因是人家根本不清楚大小规则。
*
* */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("红富士1","红色",502.29));
        apples.add(new Apple("红富士2","粉红",602.29));
        apples.add(new Apple("水晶","绿色",303.8));
        // Collections集合默认不能为对象排序的，原因是人家根本不清楚大小规则。
        // Collections.sort(apples);

        // Collections集合提供了一个排序方法。
        // （4）public static <T> void sort(List<T> list, Comparator<? super T> c)
        // 我们认为应该按照重量比较。
        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                // 比较方法：
                // 默认会自动提取集合中的两个两个对象，拿来给程序员自己比较
                // 如果程序员认为o1比o2大应该返回一个正整数即可。
                // 如果程序员认为o1比o2小应该返回一个负整数即可。
                // 如果程序员认为o1等于o2应该返回0。
                // o1 = a1
                // o2 = a2
                if(o1.getWeight() > o2.getWeight()){
                    return 1 ; // 大于
                }else if(o1.getWeight() < o2.getWeight()){
                    return -1 ; // 小于
                }
                return 0; // 相等了
            }
        });

        System.out.println(apples);
    }
}
