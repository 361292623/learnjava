package com.itheima.作业.训练3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//练习LinkedList基本方法: add, set, get, remove, clear, size方法
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add ("第一个元素");
        list.add ("第二个元素");
        list.add ("第三个元素");
        list.add ("第4个元素");
        list.add ("第5个元素");
        Iterator <String> it  = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        list.set(2,"59改");
        System.out.println("-------------------");
        Iterator <String> it1  = list.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        System.out.println("-------------------");

        for (int i = 0 ; i< list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("-------------------");
        list.remove(1);

        for (int i = 0 ; i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-------------------");
        list.clear();


        for (int i = 0 ; i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-------------------");


    }
}
