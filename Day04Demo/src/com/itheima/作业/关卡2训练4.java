package com.itheima.作业;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class 关卡2训练4 {
    public static void main(String[] args) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入：");
        char[] ch = scanner.nextLine().toCharArray();
        for(int i = 0 ;i<ch.length;i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i],1);
            }else{
                map.replace(ch[i],map.get(ch[i])+1);
            }
        }
        //System.out.println(map);

        Set<Character> lhm = map.keySet();
        for(Character cc : lhm){
            System.out.print(cc+"("+map.get(cc)+")");

        }

    }
}
