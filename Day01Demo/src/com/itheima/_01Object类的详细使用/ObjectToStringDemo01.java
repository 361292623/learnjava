package com.itheima._01Object类的详细使用;
/*
* Object类：
*     Object类是Java中的祖宗类。
*     一个类要么默认继承了Object类 (extends Object)
*     要么直接继承了Object类。
*     要么间接继承了Object类。
*
*     Object类的翻译（对象），一切皆对象。
*
*     所以其实所有的类都相当于继承了Object类，
*     所以学习Object类中的方法（API）,那么一切类都可以使用这些方法（功能）。
*
* Object类中的常用方法：
*     （1）public String toString()
*          默认是返回对象在堆内存中的地址的。
*          地址格式：类的全限名@对象在堆内存中的地址
*          举例：com.itheima._01Object类的详细使用.Student@5f150435
*
*          输出对象如果输出是对象的堆内存地址，在开发的时候通常是没有意义的。
*          开发的时候输出对象，更多的时候希望看到对象中的数据，而不是地址。
*          所以toString()方法存在的价值是为了被子类重写，以便输出对象的数据。
*
*
*          注意：直接输出对象，对象默认会调用自己的toString()方法
*               所以直接输出对象，可以省略toString()不写，默认会自动调用！
*
*     （2）public boolean equals(Object obj)
*/
public class ObjectToStringDemo01{
    public static void main(String[] args){
        // 创建一个学生对象
        Student stu = new Student("蜘蛛精",999,'女',"98期就业班");
        //System.out.println(stu.toString());
        // 直接输出对象，对象默认会调用自己的toString()方法
        System.out.println(stu);
    }
}
