package com.itheima._05动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
     1. 代理模式的分类
        * 静态代理
        * 动态代理(重点)
            * jdk的动态代理
            * cglib

     2. 代理模式的作用
        * 拦截对真实对象的直接访问，可以不修改真实对象的代码对真实对象的功能进行增强。

     3. 什么是动态代理
         * 在程序运行过程中动态创建代理类并根据代理类动态创建代理对象。

     4. 如何创建动态代理对象
         * 通过官方提供的Proxy类的静态方法创建，该方法声明如下
            * static Object	newProxyInstance(
                ClassLoader loader,
                Class[] interfaces,
                InvocationHandler h)
                * 创建代理对象
                * loader：类加载器，传递真实对象的类加载器即可。
                * interfaces：接口Class数组：new Class[]{ Star.class }
                * h： InvocationHandler是一个接口，需要传递该接口的实现类对象: 回调处理对象

        * InvocationHandler接口的方法
            public Object invoke(Object proxy, Method method, Object[] args)
                * 不要手动调用该方法
                * 每当通过代理对象调用方法时会被该方法拦截
                * proxy: 代理对象本身：不要在invoke中通过代理对象的调用方法
                * method: 代理对象调用的方法：被拦截到的方法
                * args: 代理对象调用方法时传递的参数

     5. 动态代理模式的开发步骤
        * 首先要明确哪些功能(方法)
        * 将要代理的方法定义在接口中
        * 真实对象实现接口重写接口中的方法
        * 创建真实对象：不要直接通过真实对象调用方法
        * 通过Proxy类创建代理对象
            * 参数1：真实对象的类加载器对象
            * 参数2：真实对象实现的接口
            * 参数3：InvocationHandler接口实现类对象：回调处理对象
        * 通过代理对象调用方法，在回调处理对象的invoke方法中根据需求决定要不要调用真实对象的方法。

 调用者
 */
public class DynamicProxyDemo01 {
    public static void main(String[] args){
        // 创建宝强对象：真实对象
        BabyStrong bs = new BabyStrong();

        // 创建代理对象：经纪人sjj
        Star sjj = (Star) Proxy.newProxyInstance(
                BabyStrong.class.getClassLoader(), // 真实对象类加载器对象
                new Class[]{Star.class}, // Class类型接口数组
                new InvocationHandler() {
                    public boolean tan() {
                        System.out.println("谈出场费.....");
                        return true;
                    }

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // System.out.println("进来了吗 = " + method.getName() + "=" + Arrays.toString(args));
                        if (tan()){
                            // 调用真实对象的方法：调用宝强的方法
                            Object result =  method.invoke(bs,args);
                            System.out.println("结算...清理工作...");
                            return result;
                        }
                        return null;
                    }
                }
        );
        // 调用代理对象的方法：不能直接调用真实对象的方法
        sjj.sing("绿光");
        Object result = sjj.dance();
        System.out.println("result = " + result);
    }
}
