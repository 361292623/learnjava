package com.itheima._06Map集合练习题;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* 集合嵌套：集合中的元素又是一个集合。
*
需求
传智播客包含2个班级：Java基础班，Java就业班
Java基础班
	001 李晨
	002 范冰冰
Java就业班
	001 马云
	002 马化腾

Map集合的格式：
   { Java基础班 = {001=李晨,002=范冰冰} , Java就业班 = {001=马云,002=马化腾} }


使用HashMap集合存储以上班级的学生信息，并完成以下两个需求
1. 使用keySet和增强for遍历出里面的元素
2. 使用entrySet和迭代器遍历出里面的元素

*
* */
public class ExecDemo03 {
    public static void main(String[] args) {
        // { Java基础班 = {001=李晨,002=范冰冰} , Java就业班 = {001=马云,002=马化腾} }
        // (1)定义一个Map集合存放所有的班级信息。
        Map<String , Map<String,String>> datas = new HashMap<>();

        Map<String,String> oneStus = new HashMap<>();
        oneStus.put("001","李晨");
        oneStus.put("002","范冰冰");
        datas.put("Java基础班", oneStus);

        Map<String,String> twoStus = new HashMap<>();
        twoStus.put("001","马云");
        twoStus.put("002","马化腾");
        datas.put("Java就业班", twoStus);
        System.out.println(datas);

        // 遍历出来。
        // datas = {Java就业班={001=马云, 002=马化腾}, Java基础班={001=李晨, 002=范冰冰}}
        // (1)提取所有的键
        Set<String> clazzs = datas.keySet();
        for(String clazz : clazzs){
            System.out.println(clazz);
            // 提取班级的学生信息
            Map<String,String> stus = datas.get(clazz);

            Set<Map.Entry<String, String>> entries = stus.entrySet();
            for(Map.Entry<String, String> entry : entries){
                String code = entry.getKey();
                String name = entry.getValue();
                System.out.println("\t"+code + "\t" + name);
            }
        }
    }
}
