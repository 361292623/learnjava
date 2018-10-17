package com.itheima._06Map集合练习题;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
需求
	有四种水果(苹果，香蕉，西瓜，橘子)

1. 给每种水果设定一个商品号，商品号是8位0-9的随机数，商品号码不能重复。
2. 根据商品号查询对应的商品。

   如果查不到输出：“查无此商品”
   如果能查到打印：”根据商品号：12345678，查询到对应的商品为：西瓜”
*
*  思路：
*     （1）定义四种水果(数组)
*     （2）定义一个Map集合存放每个水果和其对应的商品号。
*         { 12123113=苹果 , 32333313=香蕉 ，32133231=西瓜，21244234=橘子 }
*
*     （3）遍历四种水果的数组，为依次他们生成8位随机不重复的编号，然后存入到
*         Map集合中去。
*
* */
public class ExecDemo02 {
    public static void main(String[] args) {
        // 随机对象只需要创建一次。
        Random ran = new Random();

        // (1）定义四种水果(数组)
        String[] fruits = new String[]{"🍎","🍌","🍉","🍊"};

        // (2) 定义一个Map集合存放每个水果和其对应的商品号。
        Map<String,String> datas = new HashMap<>();

        //（3）遍历四种水果的数组，为依次他们生成8位随机不重复的编号，然后存入到
        //   Map集合中去。
        for(String name : fruits){
            // 定义一个字符串存放最终不重复的编号。
            String code = "" ;
            while(true){
                // 拼接8位随机不重复的编号
                StringBuilder sb = new StringBuilder() ;
                for(int i = 0 ; i < 8 ; i++) {
                    // 生成一个随机数
                    int ranData = ran.nextInt(10);
                    sb.append(ranData);
                }
                // 得到8位编号。
                code = sb.toString();
                // 判断编号在集合是否已经存在了。
               /* if(datas.containsKey(code)){
                    // code编码已经存在，循环继续找
                }else{
                    // 编号不存在，合法的，循环结束，已经找到了不重复的编号
                    break;
                }*/
               if(!datas.containsKey(code)){
                   // 编号不存在。找到了
                   break;
               }
            }

            // 把数据存储到datas Map集合中去
            datas.put(code,name);
        }
        System.out.println(datas);

        // 提示用户输入您要选择的水果编号
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入您要买的水果编号：");
        String code = scan.next();
        // 判断是否存在该水果
        if(datas.containsKey(code)){
            // 根据编号取出水果名称
            String fName = datas.get(code);
            System.out.println("您购买的水果是："+fName);
        }else{
            System.err.println("对不起，您的编码有问题！");
        }


    }
}
