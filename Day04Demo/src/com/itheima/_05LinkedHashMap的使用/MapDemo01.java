package com.itheima._05LinkedHashMap的使用;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
* LinkedHashMap的详细使用。
*   HashMap : 无序不重复的。
*   LinkedHashMap: 有序不重复的。
*
*   Map集合的性能都挺好的。与HashSet性能是完全一样的。
*   只是Map集合的元素多了一个附属值。
*
* */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> maps = new LinkedHashMap<>();
        maps.put("孙悟空","弼马温");
        maps.put("孙悟空","齐天大圣");
        maps.put("猪八戒","天蓬元帅");
        maps.put("吴刚","天蓬元帅");
        maps.put("沙僧","卷帘大将");
        maps.put("唐僧","玄奘法师");
        System.out.println(maps);
    }
}
