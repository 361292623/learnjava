package Day10Demo.com.itheima._07ArrayList类;

import java.util.ArrayList;

/*
* ArrayList存储自定义类型
*
* 集合引出了泛型的概念：就是一个标签。
*
*
* */
public class ArrayListDemo04 {
    public static void main(String[] args){
        // 泛型：编译阶段的时候可以约束添加的数据类型。
        // ArrayList<String> lists = new ArrayList<String>();

        // JDK1.7以后后面的类型什么可以省略不写
        ArrayList<String> lists = new ArrayList<>();
        lists.add("徐明明");
        lists.add("杨斌");
        lists.add("邓伟");

        for(int i = 0 ; i < lists.size() ; i++ ){
            String name = lists.get(i);
            System.out.println(name);
        }

        System.out.println("--------------------------------------");
        
        ArrayList<Student> stus = new ArrayList<>();
        // 创建三个学生对象
        Student yb = new Student(1,"杨斌",21,'男',"99期");
        Student zm = new Student(2,"周铭",22,'男',"99期");
        Student xmm = new Student(3,"徐明明",21,'男',"99期");
        // 把三个学生对象加入到stus集合中去
        stus.add(yb);
        stus.add(zm);
        stus.add(xmm);

        for(int i = 0 ; i < stus.size() ; i++ ) {
            Student stu = stus.get(i);
            System.out.println(stu.getName()+"==>" + stu.getClassName());
        }
    }
}
