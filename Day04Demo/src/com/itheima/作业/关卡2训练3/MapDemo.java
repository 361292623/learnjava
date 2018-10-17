package com.itheima.作业.关卡2训练3;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三丰");
        map.put(2,"周芷若");
        map.put(3,"汪峰");
        map.put(4,"灭绝师太");

        System.out.println(map);
        map.put(5,"李晓红");
        map.remove(1);
        map.replace(2,"周林");
        System.out.println(map);
    }
}
