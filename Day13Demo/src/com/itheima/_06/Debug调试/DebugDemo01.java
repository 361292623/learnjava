package com.itheima._06.Debug调试;

import java.util.ArrayList;
import java.util.List;

/*
*  Debug:
*      调试程序。
*      它是一种代码调试工具，是最经典，也是最重要的一种形式之一。
*      Debug工具是程序员理解代码，定位企业系统Bug的重要手段。
*      开发人员都应该掌握。
*
*      Debug的核心：就是程序员事先在代码中设置断点(程序的暂停点)
*                然后可以控制代码一行一行的执行，可以看到
*                代码执行的过程和各种变量的信息
*                而不是嗖的一下就跑完了。
*
* */
public class DebugDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("孙悟空");
        list.add("赵敏");
        list.add("金毛狮王");
        list.add("张强");
        list.add("张三丰");

        chu(10,2);


        // 需求1：1.请筛选出姓名有三个字符的，成为一个新集合
        List<String> threeLists = new ArrayList<>();
        for(String name : list){
            if(name.length() == 3){
                threeLists.add(name);
            }
        }

        String name1 = null ;
        System.out.println(name1.length());

        for(String name : threeLists){
            System.out.println(name);
        }

        System.out.println("-------------------------");

        // 需求2：2.我需要姓张的人
        List<String> zhangLists = new ArrayList<>();
        for(String name : list){
            if(name.startsWith("张")){
                zhangLists.add(name);
            }
        }
        for(String name : zhangLists){
            System.out.println(name);
        }
    }

    public static void chu(int a , int b){
        System.out.println(a);
        System.out.println(b);
        System.out.println(a / b);
    }
}
