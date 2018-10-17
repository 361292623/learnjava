package com.itheima._08包装类;
/*
* 包装类的突出优势：
*    （1）包装类变成了类，所以功能比基本数据类型强大很多。
*          a.转字符串
*          b.把字符串的数值转成对应类型的数据
*             XXXX.parseXXX("字符串数值"); 不建议使用
*             XXXX.valueOf("字符串数值") ; 建议使用
* */
public class BaoZhuanglei02 {
    public static void main(String[] args){
        Integer it = 12 ; // 自动装箱 。

        // 1.转字符串
        // （1）把数据转成字符串
        String rs1 = it.toString() ;
        System.out.println(rs1);

        // (2) 直接+空字符串
        // 任何数据类型与字符串+最终的结果一定是字符串！
        String rs2 = it+"";
        System.out.println(rs2);

        // （3）把数据转成字符串
        String rs3 = Integer.toString(it);
        System.out.println(rs3);

        // 2.把字符串的数值转成成对应类型的数据
        String num = "23";
        // 把字符串转成整数！
        //int numInt = Integer.parseInt(num);
        int numInt = Integer.valueOf(num);
        numInt++ ;
        System.out.println(numInt);


        String socre = "89.99";
       // double db = Double.parseDouble(socre);
        double db = Double.valueOf(socre);
        db+=10 ;
        System.out.println(db);

    }
}
