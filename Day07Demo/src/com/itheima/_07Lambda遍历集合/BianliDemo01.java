package com.itheima._07Lambda遍历集合;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BianliDemo01 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Java");
        lists.add("Java");
        lists.add("Java EE");
        lists.add("Oracle");
        /*lists.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
*/
       /* lists.forEach(s  -> {
            System.out.println(s);
        });*/

        lists.forEach(s  -> System.out.println(s) );

        // 方法引用： 以后再学。
        // lists.forEach(System.out::println );

        Map<String,String> maps = new HashMap<>();
        maps.put("admin1","111");
        maps.put("admin2","222");

     /*   maps.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String k, String v) {

            }
        });
*/
        maps.forEach(( k,  v) -> {
            System.out.println(k+"=>"+v);
        });

        maps.forEach(( k,  v) -> System.out.println(k+"=>"+v) );


    }
}
