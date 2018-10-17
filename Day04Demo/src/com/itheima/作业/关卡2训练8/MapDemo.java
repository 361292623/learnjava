package com.itheima.作业.关卡2训练8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请：");
        Random ran = new Random();//创建随机数
        Map<String, Integer> map = new HashMap<>();


        while (map.size()< 5) {
            String str = scan.nextLine();
            int i = ran.nextInt(100);
            map.put(str,i);

        }
        System.out.println(map);

    }


}
