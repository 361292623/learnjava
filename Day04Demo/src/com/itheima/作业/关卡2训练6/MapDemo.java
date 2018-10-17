package com.itheima.作业.关卡2训练6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("ccfdfd");
        list.add("sssdsd");

        Map<Character,Integer> map = new HashMap<>();

        for (String str : list){
            char[] ch  = str.toCharArray();
            for (char cc : ch){
                if (!map.containsKey(cc)){
                    map.put(cc,1);
                }else {
                    map.replace(cc,map.get(cc)+1);
                }
            }
        }

        System.out.println(map);
    }
}
