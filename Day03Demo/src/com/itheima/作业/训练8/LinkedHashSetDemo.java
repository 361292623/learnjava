package com.itheima.作业.训练8;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("王昭君");
        lhs.add("王昭君");
        lhs.add("西施");
        lhs.add("杨玉环");
        lhs.add("貂蝉");

        Iterator<String> it = lhs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------------------");
        for(String s: lhs){
            System.out.println(s);
        }
    }

}
