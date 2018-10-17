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
 *         变相的foreach遍历方式。
 *
 *    （3）JDK 1.8 之后的新技术,Lambda表达式遍历。（了解）
*
* */
public class MapDemo02 {
    public static void main(String[] args) {
        //（2）使用”键值对”的方式遍历Map集合
        Map<String,Integer> maps = new HashMap<>();
        maps.put("孙悟空",11);
        maps.put("猪八戒",2);
        maps.put("吴刚",2);
        maps.put("沙僧",3);
        maps.put("唐僧",0);
        maps.put("孙悟空",1);
        System.out.println(maps);

        // maps = {沙僧=3, 孙悟空=1, 猪八戒=2, 吴刚=2, 唐僧=0}
        // entries = [(沙僧=3) , (孙悟空=1) , (猪八戒=2) ,(吴刚=2) , (唐僧=0)]
        /*
        *  foreach格式：
        *    for(被遍历集合或者数组中元素的类型 变量 : 被遍历集合或者数组 ){
        *
        *    }
        *
        *    foreach默认是无法遍历Map集合，因为Map集合中的元素(key=value)根本没有类型。
        *
        *    Java提供了一个API把Map集合转换成Set集合。
        *       Set<Map.Entry<String, Integer>> entry = maps.entrySet();
        *
        *       entries = [(沙僧=3) , (孙悟空=1) , (猪八戒=2) ,(吴刚=2) , (唐僧=0)]
        *       //           entry
        *       此时：(沙僧=3)就存在类型，Java设计的类型是：Map.Entry<String, Integer>
        */
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"=>"+value);
        }
    }
}
