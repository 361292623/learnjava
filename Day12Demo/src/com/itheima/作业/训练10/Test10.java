package com.itheima.作业.训练10;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Test10 {
    public static void main(String[] args) {
        String[] stringsArray = {"AAA", "BBB", "CCC", "DDD",
                "EEE", "F", "GFDF",
                "HA", "aaa", "bcd"};
       Arrays.sort(stringsArray, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return -o1.compareToIgnoreCase(o2);
           }
       });
        for(String s : stringsArray){
            System.out.print(s+" ");
        }
        System.out.println();

        Arrays.sort(stringsArray, (String o1, String o2) ->
                 (o1.compareToIgnoreCase(o2))

        );
        for(String s : stringsArray){
            System.out.print(s+" ");
        }

    }
}
