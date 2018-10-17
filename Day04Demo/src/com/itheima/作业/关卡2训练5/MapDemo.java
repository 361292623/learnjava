package com.itheima.作业.关卡2训练5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        Scanner scan =new Scanner(System.in);
        System.out.print("请输入：");
        char[] ch = scan.nextLine().toCharArray();
        for(char ch1 :ch){
        if(ch1>='a'&&ch1<='z' ||ch1>='A'&&ch1<='Z'){
            countingKey((HashMap) map,"字母");
        }else if(ch1==' '){
            countingKey((HashMap) map,"空格");
        }else if(ch1>='0'&& ch1<='9'){
            countingKey((HashMap) map,"数字");
        }else {
            countingKey((HashMap) map,"其他");
        }
        }
        System.out.println(map);


    }

   public static void countingKey(HashMap map, String key){
       if(!map.containsKey(key)){ //如果不存在则存入key，值为1
           map.put(key,1);
       }else{  //如果存在则值加1
           map.put(key,(int)map.get(key)+1);
       }


   }
}
