package com.itheima._04反射_获取Constructor构造器对象;

import org.junit.Test;

import java.lang.reflect.Constructor;

/*
* 调用Constructor创建类的对象。
*   方法：
*       public T newInstance(Object ... initargs)
*       依然是去调用构造器创建对象的。
*
* */
public class ConstructorDemo02 {
    // 有参数构造器
    @Test
    public void create01() throws Exception {
        //反射的第一步永远是先获取Class类对象
        Class<?> stuClazz = Student.class;
        // 调用无参数的构造器创建对象
        Constructor c1 = stuClazz.getDeclaredConstructor();
        // 创建对象：不能传参数，因为我们的构造器是无参数
        Student stu = (Student) c1.newInstance();
        System.out.println(stu);

    }

    // 调用私有的有一个参数的构造器。
    @Test
    public void create02() throws Exception {
        //反射的第一步永远是先获取Class类对象
        Class<?> stuClazz = Student.class;
        // 调用私有有1个参数的构造器创建对象
        Constructor c1 = stuClazz.getDeclaredConstructor(String.class);

        // 反射是违背了封装性的思想
        // 反射可以强行打开权限然后去访问！
        // 打开构造器c1的权限。
        c1.setAccessible(true);

        // 创建对象：
        Student stu = (Student) c1.newInstance("孙悟空");
        System.out.println(stu);

    }


    // 3个参数
    @Test
    public void create03() throws Exception {
        //反射的第一步永远是先获取Class类对象
        Class<?> stuClazz = Student.class;
        // 调用私有有1个参数的构造器创建对象
        Constructor c1 = stuClazz.getDeclaredConstructor(String.class,int.class,String.class);

        // 创建对象：
        Student stu = (Student) c1.newInstance("孙悟空",1000,"98期");
        System.out.println(stu);
    }
}
