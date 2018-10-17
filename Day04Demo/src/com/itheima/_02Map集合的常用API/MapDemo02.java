package com.itheima._02Map集合的常用API;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* 常用API:
     * V put(K key, V value)
     * 存储键值对
     * 如果键存在，则使用新值替换旧值，返回旧值。
     * 如果键不存在，则直接存储，返回null

     * V get(Object key)
     * 根据键获得对应的值,如果键不存在，则返回null

     * V remove(Object key)
     * 根据键删除键值对
     * 返回键对应的值

     * int size();
     * 获得键值对的对数

     * void	clear()
     * 清空集合

     * boolean containsKey(Object key)
     * 判断集合中是否包含指定的键，如果包含返回true，否则false

     * boolean isEmpty()
     * 判断集合是否为空，为空返回true，否则false

 *
 */
public class MapDemo02 {
    public static void main(String[] args) {
        // 创建一个Map集合
        Map<String,String> maps = new HashMap<>();
        maps.put("孙悟空","弼马温");
        maps.put("孙悟空","齐天大圣");
        maps.put("猪八戒","天蓬元帅");
        maps.put("吴刚","天蓬元帅");
        maps.put("沙僧","卷帘大将");
        maps.put("唐僧","玄奘法师");
        System.out.println(maps);

        // 清空Map集合
        //maps.clear();
        System.out.println(maps);

        // 获取Map集合的大小
        System.out.println(maps.size());

        // 判断Map集合是否包含了某个键,包含返回true,反之
        System.out.println(maps.containsKey("唐僧1"));
        System.out.println(maps.containsKey("唐僧"));

        // 判断Map集合是否包含了某个值
        System.out.println(maps.containsValue("弼马温"));
        System.out.println(maps.containsValue("齐天大圣"));

        // 根据Map集合的键获取对应的值
        String value = maps.get("沙僧");
        System.out.println(value);

        // 判断集合是否为空 为空返回true
        System.out.println(maps.isEmpty());
        /*// 根据键删除这个元素。
        System.out.println(maps);
        // 删除键对应的元素，并返回键对应的值。
        System.out.println(maps.remove("猪八戒"));
        System.out.println(maps);*/

        // 获取Map集合所有的键，返回的是一个Set集合
        Set<String> keys = maps.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println(maps);
        // 获取Map集合所有的值，返回的是一个Collection集合。
        Collection<String> values = maps.values();
        for(String v : values){
            System.out.println(v);
        }
    }
}
