package com.itheima._07拓展_模拟Hibernate框架;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
* Hibernate:任何数据直接封装成对象，交给我，我直接就给你保存到数据库 。
*
* 需求：
*    给你任何一个对象，你都可以把这个对象的字段和对应的数据值保存到文件中去。
*
*    网页：
*       注册学生 ： 界面上的数据 -> new Student() -> 保存
*       注册用户：  界面上的数据 -> new User()   -> 保存
*       注册班级：  界面上的数据 -> new Class() -> 保存
*
*    写一个通用的保存技术：框架！
*
* */
public class SaveHibernateDemo01 {
    public static void main(String[] args) throws Exception {
        // 对象数据
        // (String cardId, int age, char sex, String addr)
        User u = new User("110",23 , '男',"中国广州");
        Student stu = new Student("孙悟空",1111,"98期");
        Clazz clazz = new Clazz("最牛逼的98期","Java 98",80);
        save(u);
        save(stu);
        save(clazz);
    }

    public static void save(Object obj) throws Exception {
        OutputStream os = new FileOutputStream("src/mysql.data" ,true);
        PrintStream ps = new PrintStream(os);

        // 不清出对象obj是啥，其次根本不知道对象的数据和字段
        // 但是反射啥都知道！所以反射非常适合做通用技术框架思想！
        Class<?> objClazz = obj.getClass();
        String name = objClazz.getSimpleName(); // 类的简名
        ps.println("数据类型："+name);

        // 获取这个对象类的所有成员变量
        Field[] fields = objClazz.getDeclaredFields();
        for(Field f : fields){
            // 获取这个对象obj中f成员变量的值
            /*
            这行代码开发禁止使用！
            据我所查几乎框架都不会这样来获取数据
            破坏了Java的封装性
            f.setAccessible(true);
            String rs = f.get(obj)+""; */

            // 建议通过方法访问。
            // 不会破坏封装性，规范写。
            // 定位成员变量对于的get方法
            String getF = "get" + (f.getName().charAt(0)+"").toUpperCase() + f.getName().substring(1); // getname
            //System.out.println(getF);
            Method getFMethod = objClazz.getDeclaredMethod(getF);
            String rs = getFMethod.invoke(obj)+"";
            ps.println(f.getName()+"=>"+rs);

        }
        ps.flush();
        ps.close();

    }

}
