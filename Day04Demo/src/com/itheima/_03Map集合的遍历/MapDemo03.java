package com.itheima._03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;

/*
 * Map集合的遍历方式：有三种。
 *    （1）键找值遍历方式：先提取Map集合所有的键，
 *        再通过遍历键去找对应值。
 *
 *    （2）使用”键值对”的方式遍历Map集合
 *         变相的foreach遍历方式。
 *
 *    （3）JDK 1.8 之后的新技术,Lambda表达式遍历。（了解）
 *
*
* */
public class MapDemo03 {
    public static void main(String[] args) {
        // （3）JDK 1.8 之后的新技术,Lambda表达式遍历。（了解）
        Map<String,Integer> maps = new HashMap<>();
        maps.put("孙悟空",11);
        maps.put("猪八戒",2);
        maps.put("吴刚",2);
        maps.put("沙僧",3);
        maps.put("唐僧",0);
        maps.put("孙悟空",1);
        System.out.println(maps);

        maps.forEach((k,v) ->  System.out.println(k+"==>"+v) );


    }
}
