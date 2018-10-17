package com.itheima._01Map集合的概述和特点;

import java.util.HashMap;
import java.util.Map;

/*
* Map集合：
*    Map集合也是一个容器。
*    Map集合和Collection集合不存在包含关系，
*    他们是属于不同的集合体系。
*
*    Map集合是键值对(key=value)集合。
*    key是键 value是值
*    Map集合中的每个元素是包含两个值的。 key=value
*    Collection集合中的每个元素是包含一个值的。
*
*    Map集合的格式:
*      {key1=value1 , key2=value2 , key3=value3 , ...}
*
*    为什么需要有Map集合?
*       1.如果要保存一个人的信息
*         Collection : ["常浩",23,"广州","男","Java"]
*         Map: {name="常浩",age=23,addr="广州",sex="男",study="Java"}
*         Map集合有时候可以传输非常清晰的信息数据。
*
*       2.做一个购物车。
*         购物车一般用Map集合是可以实现的。
*         Map: { iphoneXS=1 , iphoneX=10 , 娃娃=1 }
*
*    Map集合的体系结构：
*       Map<K,V>(接口)
*          |
*       HashMap<K,V>(实现类，用的最多)
*          |
*       LinkedHashMap<K,V>(实现类)
*
*   Map集合的特点:
*       Map集合和泛型都只能支持引用数据类型。
*       Map集合的键是无序不重复的,但是Map集合的值是不做要求的。
*       Map集合重复键的元素会覆盖前面的元素。
*       Map集合的键值对都可以为null.
*
*   HashMap: HashMap的键与HashSet元素的特性是完全一样的。
*            如果把HashSet的每个元素都带上一个附属值，那么就变成了HashMap集合。
*
* */
public class MapDemo01 {
    public static void main(String[] args) {
        // 创建一个Map集合
        Map<String,Integer> maps = new HashMap<>();
        // 保存元素
        maps.put("iphoneXS",10);
        maps.put("iphoneXS",1);
        maps.put("iphoneX",2);
        maps.put("娃娃",2);
        maps.put("充电宝",2);
        maps.put(null, null);
        System.out.println(maps);
    }
}
