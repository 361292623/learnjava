package com.itheima.作业.关卡1训练4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","baby");
        map.put("谢霆锋","张柏芝");
        System.out.println(map);
        Set<String> keySet = map.keySet();
        Iterator<String > it = keySet.iterator();
        while (it.hasNext()){
            System.out.println(map.get(it.next()));

        }


    }
}
