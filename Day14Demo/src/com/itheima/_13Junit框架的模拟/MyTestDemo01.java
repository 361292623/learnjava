package com.itheima._13Junit框架的模拟;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 模拟Junit框架的开发：
*    需求:只要有@Test注解的方法，启动全部执行。
*        而且永远存在这个注解。
*
*    模拟：
*       1.自定义一个注解MyTest
*         永远存活。
*           @Target(ElementType.METHOD) // 只能用在方法
            @Retention(RetentionPolicy.RUNTIME)
                public @interface MyTest {
            }
        2.模拟启动测试

     总结：
         注解可以“标记”一个事物，然后达成一个功能！

*
* */
class MyTestDemo {
    @MyTest
    public void test1(){
        System.out.println("===test1====");
    }

    @MyTest
    public void test2(){
        System.out.println("===test2===");
    }

    @MyTest
    public void test3(){
        System.out.println("===test3===");
    }

    @MyTest
    public void sing(){
        System.out.println("===sing===");
    }

    @MyTest
    public void test4(){
        System.out.println("===test4===");
    }

    public void test5(){
        System.out.println("===test5===");
    }
}

//  2.模拟启动测试
public class MyTestDemo01{
    public static void main(String[] args) throws Exception, IllegalAccessException {
        MyTestDemo myTest = new MyTestDemo();
        // 先得到MyTestDemo.class
        Class<?>  myTestClass = myTest.getClass();
        // 获取测试类myTestClass的全部方法。
        Method[] mt = myTestClass.getDeclaredMethods();
        for(Method m : mt){
            // 判断这个方法是否有注解，注解是否是MyTest
            if(m.isAnnotationPresent(MyTest.class)){
                // 说明m方法被MyTest标记了，启动它！
                m.invoke(myTest);
            }
        }
    }
}