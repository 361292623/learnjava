package com.itheima._14枚举;
/*
* 枚举：
*     枚举是一个新特性：
*     Java中枚举的代表是Enum
*     枚举就是一一罗列枚举类的实例。
*     枚举是一个引用数据类型。
*
*
*     格式：
*        public enum 枚举名称{
*           对象名称,对象名称,对象名称,对象名称，对象名称;
*        }
*
*     枚举的构造器都是私有的，枚举不能创建对象。
*     枚举的对象名称：所指向的就是枚举的对象，是枚举自己创建的对象，是一个常量。
*     枚举对象名称应该大写。
*     枚举只能有定义的那几个实例
*
*     枚举是用来做信息分类的。非常直观，非常严谨。
*
*
* */
public class MeijuDemo01 {
    // 计算机
    // 常量:信息分类
    public static final int Spring = 1 ;
    public static final int AUTUM = 2 ;
    public static final int SUMMER = 3 ;
    public static final int WINTER = 4 ;

    public static void main(String[] args) {
        test1(Season.AUTUM);
        test1(Season.SPRING);

    }

    public static void test1(Season son){
       if(son == Season.SPRING){

       }else if(son == Season.SPRING){

       }
    }


    public static void test(int flag){
        switch (flag){
            case 1:
                System.out.println("春");
                break;
            case 2:
                System.out.println("秋");
                break;
            case 3:
                System.out.println("夏");
                break;
            case 4:
                System.out.println("冬");
                break;
        }
    }

}
