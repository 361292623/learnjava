package com.itheima._06Map集合练习题;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* （1）从键盘中录入一个字符串：计算一个字符串中每个字符出现次数。
*        aabbccc   {a=2 , b=2 , c=3}
*
*     思路：
*        a.提示用户输入一个字符串。 aabbccc
*        b.定义一个Map集合存储最终统计的信息。
*        c.统计遍历字符串中的每个字符。
*
* */
public class ExecDemo01 {
    public static void main(String[] args) {
        //  a.提示用户输入一个字符串。 aabbccc
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入您的字符：");
        String chs = scan.next();

        // b.定义一个Map集合存储最终统计的信息。
        Map<Character , Integer> datas = new HashMap<>();

        // c.统计遍历字符串中的每个字符。
        // chs = aabbccc
        // {a=2，b=2, c=3}
        for(int i = 0 ; i < chs.length() ; i++){
            char ch = chs.charAt(i);
            // 去Map集合中看这个字符之前是否已经出现过了
            // 如果出现过，次数+1
            // 如果每个出现过，加入集合次数为1

            // 判断datas集合中是否包含了某个键
            if(datas.containsKey(ch)){
                // 之前出现过了，之前的次数应该+1
                // 先获取这个字符之前出现的次数
                Integer num = datas.get(ch);
                //num++; // 加1
                // 从新存入到集合中去。
                datas.put(ch , ++num);
            }else{
                // 之前没有出现过
                datas.put(ch,1);
            }
        }
        System.out.println(datas);

    }
}
