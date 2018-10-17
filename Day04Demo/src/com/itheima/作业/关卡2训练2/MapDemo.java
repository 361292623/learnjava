package com.itheima.作业.关卡2训练2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("柳岩",2100);
        map.put("张亮",1100);
        map.put("贤总",12100);
        map.put("灿亮",42100);
        map.put("然哥",22100);

        map.replace("柳岩",1000);

        Set<String> set1 = map.keySet();
        for(String srt : set1){
        System.out.println(srt+"-->"+map.get(srt));


    }}
}
