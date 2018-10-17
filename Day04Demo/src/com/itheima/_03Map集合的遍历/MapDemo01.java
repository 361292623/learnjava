package com.itheima._03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Map集合的遍历方式：有三种。
*    （1）键找值遍历方式：先提取Map集合所有的键，
*        再通过遍历键去找对应值。
*
*    （2）使用”键值对”的方式遍历Map集合
*
*    （3）JDK 1.8 之后的新技术,Lambda表达式遍历。（了解）
*
*
*
* */
public class MapDemo01 {
    public static void main(String[] args){
        Map<String,String> maps = new HashMap<>();
        maps.put("孙悟空","弼马温");
        maps.put("猪八戒","天蓬元帅");
        maps.put("吴刚","天蓬元帅");
        maps.put("沙僧","卷帘大将");
        maps.put("唐僧","玄奘法师");
        maps.put("孙悟空","齐天大圣");
        System.out.println(maps);

        // （1）键找值遍历方式：先提取Map集合所有的键，
        //        再通过遍历键去找对应值。
        Set<String> keys = maps.keySet();
        for(String key : keys){
            // 键找对应的值
            String value = maps.get(key);
            System.out.println(key+"=>"+value);
        }
    }
}
