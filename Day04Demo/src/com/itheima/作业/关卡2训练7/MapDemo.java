package com.itheima.作业.关卡2训练7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入：");
        String[] str = scan.nextLine().split(" ");

        for (String strF : str){
            if(!map.containsKey(strF)){
                map.put(strF,1);
            }else {
                map.replace(strF,map.get(strF)+1);
            }
        }

        System.out.println(map);



    }
}
