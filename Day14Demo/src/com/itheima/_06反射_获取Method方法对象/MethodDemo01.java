package com.itheima._06反射_获取Method方法对象;

import java.lang.reflect.Method;

/*
*  反射为方法设计了一个类对象：Method.
*
*  Method getMethod(String name,Class...args);
 * 根据方法名和参数类型获得对应的构造方法对象，只能获得public的

 * Method getDeclaredMethod(String name,Class...args);
 * 根据方法名和参数类型获得对应的构造方法对象，包括private的

 * Method[] getMethods();
 * 获得类中的所有成员方法对象，返回数组，只能获得public修饰的且包含父类的

 * Method[] getDeclaredMethods();
 * 获得类中的所有成员方法对象，返回数组,只获得本类的，包含private修饰的
*
*
* */
public class MethodDemo01 {
    public static void main(String[] args) throws Exception {
        Class<?> stuClazz = Student.class ;
        // 获取所有方法：只要申明了都可以拿到
        Method[] ms = stuClazz.getDeclaredMethods();
        for(Method m : ms){
            System.out.println(m.getName() + "=>"+ m.getParameterCount());
        }

        // 定位某个方法:获取无参数的sing方法
        Method m = stuClazz.getDeclaredMethod("sing");
        Method m1 = stuClazz.getDeclaredMethod("sing",String.class);
    }
}

