package com.itheima.作业.关卡2训练1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请按格式输入：");
        while (map.size()<5){
            String[] str= scanner.next().split(",");
            map.put(str[0],str[1]);
        }
        System.out.println(map);

    }

}
