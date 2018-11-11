package com.itheima._04反射回顾;

import java.lang.reflect.Method;

/**
    1.通过反射调用方法
    2.类加载器的作用
        什么是类加载器
            * 一个负责加载类的对象则称为类加载器。

        类加载器的作用
            * 将类的字节码文件从硬盘中加载到内存中并在内存中创建一个java.lang.Class对象。

        类加载的分类
            * 引导类加载器：BootstrapClassLoader 加载核心包的类：比如String,ArrayList
            * 扩展类加载器：ExtClassLoader 负责加载扩展包的类
            * 应用类加载器：AppClassLoader 负责加载程序猿创建的类和第三jar种的类

        AppClassLoader和ExtClassLoader都是ClassLoader子类
        BootstrapClassLoader类不是java类，是由c和c++编写的

        如何获得类加载器对象
            * 通过Class对象的方法获得，该方法声明如下
                * ClassLoader getClassLoader();
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        // 获得Class对象
        Class c = Student.class;

        // 获得类加载器对象
        ClassLoader classLoader01 = c.getClassLoader();
        System.out.println(classLoader01);

        ClassLoader classLoader02 = String.class.getClassLoader();
        //null：由引导类加载器负责加载的
        System.out.println(classLoader02);

        ClassLoader classLoader03 = ReflectDemo01.class.getClassLoader();
        System.out.println(classLoader03);

        // 创建学生对象：newInstance()过时不建议使用，不能说不能使用。
        // Object obj = c.newInstance();
        Object obj = c.getConstructor().newInstance();
        // 获得Method对象
        Method m = c.getMethod("study", String.class, int.class);
        // 调用方法
        Object result = m.invoke(obj,"小泷",8);
        System.out.println(result);
    }
}
