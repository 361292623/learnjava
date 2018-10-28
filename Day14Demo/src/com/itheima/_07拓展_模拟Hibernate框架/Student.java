package com.itheima._07拓展_模拟Hibernate框架;

public class Student {

    private String name ;
    private int age ;
    private String className ;

    public Student() {
        System.out.println("==无参数构造器==");
    }

    private Student(String name){
        System.out.println("==私有的有1个参数构造器==");
        this.name = name;
    }

    public Student(String name, int age, String className) {
        System.out.println("==有3个参数构造器==");
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public void sing(){
        System.out.println("唱歌中..");
    }

    public String sing(String songName){
        System.out.println("我在唱歌："+songName);
        return "返回唱的真棒！";
    }

    public static void test(){
        System.out.println("==test==");
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
                '}';
    }
}
