package com.itheima.作业.关卡2训练2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UseHashSet {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        Collections.addAll(hs,"张三","李四","王五","二丫","钱六","孙七");
        hs.remove("二丫");
        hs.add("王小丫");
        System.out.println(hs);
    }
}
