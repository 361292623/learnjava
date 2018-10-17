package com.itheima.作业.训练4;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.addFirst ("第一个元素");
        list.addFirst ("第二个元素");
        list.addFirst ("第三个元素");
        list.addFirst ("第4个元素");
        list.addLast ("第5个元素");

        for (int i = 0 ; i < list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------");
        System.out.println("第一个元素:"+list.getFirst());
        System.out.println("最后元素:"+list.getLast());
        System.out.println("-----------------------");


        list.removeFirst();


        for (int i = 0 ; i < list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------");
        list.removeLast();

        for (int i = 0 ; i < list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
