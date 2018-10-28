package com.itheima._05反射_获取Field成员变量对象;

import java.lang.reflect.Field;

/*
* 反射为所有的成员变量设计了一个类对象：Field
*   --  通过Field对象给对应的成员变量赋值和取值
*
*  1.Field getField(String name);
*  根据成员变量名获得对应Field对象，只能获得public修饰
*  2.Field getDeclaredField(String name);
*  根据成员变量名获得对应Field对象，包含private修饰的
*  3.Field[] getFields();
*  获得所有的成员变量对应的Field对象，只能获得public的
*  4.Field[] getDeclaredFields();
*  获得所有的成员变量对应的Field对象，包含private的
*
* */
public class FieldDemo01 {
    public static void main(String[] args) throws Exception {
        // 反射先获取Class类对象
        Class<?> stuClazz = Student.class;
        // 获取它全部的成员变量：public的才可以获取
        //Field[] fields = stuClazz.getFields();
        // 获取它全部的成员变量：只要申明了就可以拿到
        Field[] fields = stuClazz.getDeclaredFields();
        for(Field f : fields){
            System.out.println(f.getName() + "=>" + f.getType());
        }
        // 获取某一个成员变量
        //Field nameF = stuClazz.getField("name");
        Field nameF = stuClazz.getDeclaredField("name");
    }
}
