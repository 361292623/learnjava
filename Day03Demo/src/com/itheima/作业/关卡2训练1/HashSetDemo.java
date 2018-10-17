package com.itheima.作业.关卡2训练1;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a","a","a","a","a","f","b","c","a","d");
        Set<String> hs = new HashSet<>();
        for (int i = 0 ;i<list.size();i++)
            Collections.addAll(hs,list.get(i));
        list.clear();
        for (String i : hs)
            list.add(i);
        System.out.println(list);
    }

}
