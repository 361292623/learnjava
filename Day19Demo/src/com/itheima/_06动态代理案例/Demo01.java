package com.itheima._06动态代理案例;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo01 {
    public static void main(String[] args){
        // 创建数据访问层对象：真实对象
        StudentDao stuDao = new StudentDao();
        // 创建学生对象
        Student stu = new Student();

        // 创建代理对象
        Dao proxy = (Dao) Proxy.newProxyInstance(
                StudentDao.class.getClassLoader(),  // 真实对象类加载器
                new Class[]{Dao.class},  // 真实实现的接口
                new InvocationHandler() {
                    // 检查是否有权限
                    public boolean check(){
                        System.out.println("检查权限....");
                        return true;
                    }
                    // 保存日志信息
                    public void log(){
                        System.out.println("保存日志信息....");
                    }
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 检查是否有权限
                        if(check()){
                            // 调用真实对象的方法
                            Object result =  method.invoke(stuDao,args);
                            // 保存日志信息
                            log();
                            return  result;
                        }
                        // 没有权限，则不执行真实对象的方法
                        return null;
                    }
                });

        // 通过代理调用方法对学生增删改查
        proxy.save(stu);
       /* proxy.update(stu);
        proxy.delete(1);
        Student student = (Student) proxy.find(2);*/
    }
}
