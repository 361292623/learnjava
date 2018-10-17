package com.itheima._04HashMap存储自定义类型键值;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
*
*  HashMap存储自定义类型键值
*
*
* */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<Apple, String> maps = new HashMap<>();
        Map<Apple, Apple> maps1= new HashMap<>();
        maps.put(new Apple("红富士", "红色", 503.2), "广东");
        maps.put(new Apple("红富士", "红色", 503.2), "山东");
        maps.put(new Apple("水晶", "绿色", 603.2), "陕西");
        System.out.println(maps);

        Set<Apple> aps = maps.keySet();
        for(Apple a : aps){
            System.out.println(a);
        }
    }
}
