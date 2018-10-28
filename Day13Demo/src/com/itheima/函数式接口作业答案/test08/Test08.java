package com.itheima.函数式接口作业答案.test08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 12.1 需求说明
 Function接口中的抽象方法：r apply(t)
 1. 使用lambda表达式分别将以下功能封装到Function对象中
 a)  求Integer类型ArrayList中所有元素的平均数
 b)  将Map<String,Integer>中value值存到ArrayList<Integer>中
 c)  将Map<String,Double>中的所有value向上取整为Integer
    Map<String,Double> ==> Map<String,Integer>
 2. 已知ArrayList<Integer>  list 元素{3,7,6,15,8}，利用Function求集合元素平均数。
 3. 已知Map<String,Double> map 元素{"岑小村":59.4，"谷天洛": 82.0，"渣渣辉":98.9，
 "蓝小月": 65.2， "皮几万":70.1}，利用Function，将map的value先向上取整，再求其平均数
 */
public class Test08 {
    public static void main(String[] args){
        // a)  求Integer类型ArrayList中所有元素的平均数
        Function<ArrayList<Integer>,Integer> f1 = list -> {
            int sum = 0;
            for (Integer num:list
                 ) {
                sum += num;
            }
            return sum/list.size();
        };

        // b)  将Map<String,Integer>中value值存到ArrayList<Integer>中
        Function<Map<String,Integer>,ArrayList<Integer>> f2 = map ->{
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(map.values());
            return list;
        };

        // c) 将Map<String,Double>中的所有value向上取整为Integer
        Function<Map<String,Double>,Map<String,Integer>> f3 = map ->{
            Map<String,Integer> result = new HashMap<>();
            for (Map.Entry<String, Double> entry : map.entrySet()){
                result.put(entry.getKey(), (int) Math.ceil(entry.getValue()));
            }
            return result;
        };

        // 2. 已知ArrayList<Integer>  list 元素{3,7,6,15,8}，利用Function求集合元素平均数。
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,3,7,6,15,8);
        int avg = f1.apply(list);
        System.out.println(avg);

        //  3. 已知Map<String,Double> map 元素{"岑小村":59.4，"谷天洛": 82.0，"渣渣辉":98.9，
        // "蓝小月": 65.2， "皮几万":70.1}，利用Function，将map的value先向上取整，再求其平均数
        Map<String,Double> map = new HashMap<>();
        map.put("岑小村", 59.4);
        map.put("谷天洛", 82.0);
        map.put("渣渣辉", 98.9);
        map.put("蓝小月", 65.2);
        map.put("皮几万", 70.1);

        int avg2 = f3.andThen(f2).andThen(f1).apply(map);
        System.out.println(avg2);
    }
}
