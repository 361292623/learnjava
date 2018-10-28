package com.itheima._04反射_获取Constructor构造器对象;

import java.lang.reflect.Constructor;

/*
*  反射为构造器设计了一个类叫： Constructor
*    -- 获得Constructor对象来创建类的对象。
*
*  反射的第一步永远是先获取Class类对象
*
*  获取构造器：
     1. Constructor getConstructor(Class... parameterTypes)
            * 根据参数类型获得对应的Constructor对象。
            * 只能获得public修饰的构造方法
     2. Constructor getDeclaredConstructor(Class... parameterTypes)
             * 根据参数类型获得对应的Constructor对象，包括private
     3. Constructor[] getConstructors()
            获得类中的所有构造方法对象，只能获得public的
     4. Constructor[] getDeclaredConstructors()
            获得类中的所有构造方法对象，包括private修饰的
*
* */
public class ConstructorDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.获取Class类对象
        Class<?> clz = Student.class;

        // 2.获取构造器:只能获取public修饰的构造器
       /* Constructor[] allcs = clz.getConstructors();
        System.out.println(allcs.length);*/

        // 3.获取所有的构造器：只要是构造器哪怕是私有的也能得到。
        // 获取申明的所有构造器。
        Constructor[] allcs = clz.getDeclaredConstructors();
        System.out.println(allcs.length);
        for(Constructor c : allcs){
            System.out.println(c.getName() + "=>" + c.getParameterCount());
        }

        // 4.获取某一个构造器
        // 获取无参数构造器
        Constructor cs1 = clz.getConstructor();// 只能拿public
        Constructor cs2 = clz.getDeclaredConstructor(); // 被申明的

        // 根据参数匹配获取某个有参数的构造器对象。
        Constructor cs4 = clz.getDeclaredConstructor(String.class); // 被申明的
        Constructor cs5 = clz.getDeclaredConstructor(String.class , int.class , String.class); // 被申明的
    }
}
