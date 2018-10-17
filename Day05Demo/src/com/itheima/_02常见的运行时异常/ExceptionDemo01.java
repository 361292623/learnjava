package com.itheima._02常见的运行时异常;
/*
*  常见运行时异常:这个异常是在编译阶段不会报错，但是在运行阶段可能会出错的
*             运行时异常一定是RuntimeException的子类或者就是
*             RuntimeException自己的异常。
*
*  常见运行时异常：
*     （1） 数组索引越界异常 ArrayIndexOutOfBoundsException
*     （2） 空指针异常      NullPointerException
*          是把变量的引用设置成了null,
*          那么这个变量实际上是不存在对象的，
*          如果你再去访问这个对象的方法去操作这个对象，那么就会出现空指针异常。
*     (3)  算术运行异常    ArithmeticException
*     （4） 类型转换异常    ClassCastException
*     (5) 数值转换异常 NumberFormatException
*/
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        /*// (1)数组索引越界异常
        int[] arrs = new int[]{10,30,50};
        System.out.println(arrs[2]); // 50
        System.out.println(arrs[3]); // 抛出异常，程序立即死亡
        System.out.println(arrs[1]); // 无机会执行了*/

        // （2）空指针异常。 NullPointerException
        String name = "itheima";
        name = null ;
        //System.out.println(name);
        //System.out.println(name.length());

        // (3) 除 0
        //int c = 10 / 0 ;
        //System.out.println(c);

        // （4）类型转换异常
        Object obj = "abc";
        // 有继承关系的两个类是可以强制转换，编译阶段一定不会报错。
        // 但是运行阶段可能会出异常，
        //Integer it = (Integer) obj;

        // （5）数值转换异常
        String str = "afas";
        Integer num = Integer.valueOf(str);
        System.out.println(num+1);

        System.out.println("程序结束");
    }
}
