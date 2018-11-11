package com.itheima._02动态代理回顾;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
    动态代理回顾
 */
public class Demo01 {
    public static void main(String[] args){
        // 创建集合对象:真实对象
        ArrayList<String> list = new ArrayList<>();
        // 创建代理对象
        List proxy = (List) Proxy.newProxyInstance(

                list.getClass().getClassLoader(),

                new Class[]{List.class},

                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 判断是否add方法
                        if(method.getName().equals("add")){
                            // 获得参数
                            String param = "itcast_"+args[0];
                            // 调用真实对象的方法
                            return method.invoke(list,param);
                        }
                        // 直接调用真实对象list的方法
                        return method.invoke(list,args);
                    }
                });

        // 通过代理对象：添加元素
        proxy.add("aa");
        proxy.add("bb");
        proxy.add("cc");
        proxy.remove("itcast_aa");
        System.out.println(list);
    }
}
