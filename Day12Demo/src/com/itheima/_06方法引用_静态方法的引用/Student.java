package com.itheima._06方法引用_静态方法的引用;

import java.util.Objects;

/*
* 创建一个学生类:
*
* */
public class Student {
    private String name ;
    private int age ;
    private String className ;

    // 定义一个学生类的比较规则：按照年龄
    public static int compareByAge(Student o1,Student o2){
        return  o1.getAge() - o2.getAge();
    }

    public Student() {
    }

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}'+"\n";
    }
}
