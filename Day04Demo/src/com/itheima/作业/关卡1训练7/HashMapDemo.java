package com.itheima.作业.关卡1训练7;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String,Student> map = new HashMap<>();
        map.put("吉山幼儿园",new Student("贤主席",18));
        map.put("吉山幼儿园1",new Student("贤主席1",15));
        map.put("吉山幼儿园2",new Student("贤主席2",16));
        map.put("吉山幼儿园3",new Student("贤主席3",17));
        System.out.println(map);
        Set<String> keySet = map.keySet();
        for(String str :keySet){
            System.out.println(str+"-->"+map.get(str).toString());
        }

        System.out.println("-------------------");
        Set<Map.Entry<String,Student>> entrySet = map.entrySet();

        System.out.println(entrySet);

        System.out.println(map.entrySet());

        Set s = new HashSet();
        s.add("ahahhaa");
        s.add("ahah3haa");
        s.add("aha3hhaa");
        s.add("aha2hhaa");
        s.add("aha1hhaa");
        System.out.println(s);





    }
}
