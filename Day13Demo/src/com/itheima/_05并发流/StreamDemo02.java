package com.itheima._05并发流;

import java.util.ArrayList;
import java.util.List;

/*
* 并发流和串行流的执行原理。
*   并发流：性能好。
*   但是请注意并发流的筛选不是有序的。随机。
* */
public class StreamDemo02 {
    public static void main(String[] args) {
        List<Integer>  lists = new ArrayList<>();
        for(int i = 0 ; i < 100 ; i++ ){
            lists.add(i);
        }
        // 串行流
       /* lists.stream().filter(s ->{
            System.out.println(Thread.currentThread().getName());
            return s % 2 == 0;
        } ).forEach(System.out::println);*/


       // 多线程筛选：性能好！
        lists.parallelStream().filter(s ->{
            System.out.println(Thread.currentThread().getName());
            return s % 2 == 0;
        } ).forEach(System.out::println);
    }
}
