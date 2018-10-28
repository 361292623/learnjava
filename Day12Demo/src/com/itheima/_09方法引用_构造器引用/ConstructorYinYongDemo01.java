package com.itheima._09方法引用_构造器引用;

import java.util.Calendar;

/*
* 构造方法引用的格式：类名::new
  构造方法引用的注意事项
    * 函数式接口中的抽象方法返回值类型和被引用的构造器的类名一致。
    * 被引用的构造器要和抽象方法具有相同的参数列表。
*
*
* */
public class ConstructorYinYongDemo01 {
    public static void main(String[] args) {
    /*  PeopleInterF pif = new PeopleInterF() {
            @Override
            public People createPeople(String name) {
                return new People(name);
            }
        };
*/
        /*PeopleInterF pif = name-> {
                return new People(name);
        };*/

       // PeopleInterF pif = name-> new People(name);

        // 构造器引用： 类名::new
        PeopleInterF pif = People::new;
        People p1 = pif.createPeople("孙悟空");
        System.out.println(p1);
    }
}

@FunctionalInterface
interface PeopleInterF {
    // 创建人类对象
    People createPeople(String name);
}

class People{
    private String name ;
    public People(String name){
        this.name = name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}