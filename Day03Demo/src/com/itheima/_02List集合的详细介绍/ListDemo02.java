package com.itheima._02List集合的详细介绍;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* List集合的遍历方式有几种: 4种。
*    （1） 迭代器
*    （2） foreach
*    （3） List集合有索引，所以可以按照for循环遍历
*    （4） JDK1.8以后的新技术:Lambda表达式。
*
* */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Java");
        lists.add("Java");
        lists.add("Java EE");
        lists.add("Oracle");
        System.out.println(lists);

        // (1) 迭代器
        // a.先获取当前被遍历集合的迭代器
        Iterator<String> it = lists.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("------------------------------");
        //（2） foreach
        for(String ele : lists){
            System.out.println(ele);
        }

        System.out.println("------------------------------");
        //（3） List集合有索引，所以可以按照for循环遍历
        for(int i = 0 ; i < lists.size(); i++){
            System.out.println(lists.get(i));
        }

        System.out.println("------------------------------");
        //（4) JDK1.8以后的新技术:Lambda表达式。
        /*lists.forEach(s->{
            System.out.println(s);
        });*/
        lists.forEach(s-> System.out.println(s) );

    }
}
