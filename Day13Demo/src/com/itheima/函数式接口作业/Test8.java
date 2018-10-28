package com.itheima.函数式接口作业;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {

        Function<Map<String,Integer>,ArrayList<Integer>> fun1= s ->{
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(s.values());
            return list;
        };

        Function<Map<String,Double>,Map<String,Integer>> fun2 = map ->{
          Map<String,Integer> ru = new HashMap<>();
          for(Map.Entry<String,Double> entry : map.entrySet() ){
              ru.put(entry.getKey(), (int) Math.ceil(entry.getValue()));
          }
          return ru;
        };
        Function<ArrayList<Integer>,Double> fun3 = list ->{
          int cout = 0;

          for (int i : list){
              cout+=i;
          }
          return (double)cout/list.size();

        };

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(12);
        double d = fun3.apply(list);
        System.out.println(d);
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,1,2,3,4,5,6,6);


        Map<String,Double> map1 = new HashMap<>();
        map1.put("岑小村", 59.4);
        map1.put("谷天洛", 82.0);
        map1.put("渣渣辉", 98.9);
        map1.put("蓝小月", 65.2);
        map1.put("皮几万", 70.1);
        Map<String,Integer> map2 = new HashMap<>();
        double avg  = fun2.andThen(fun1).andThen(fun3).apply(map1);


    }

}

