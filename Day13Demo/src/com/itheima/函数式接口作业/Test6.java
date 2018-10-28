package com.itheima.函数式接口作业;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test6 {
    public static void main(String[] args) {
        List<Student> stus = new ArrayList<>();
        stus.add(new Student("jack",23,100));
        stus.add(new Student("rose",18,98));
        stus.add(new Student("lily",25,88));
        stus.add(new Student("lucy",16,60));

        List<Student> stus1 = fileter(stus,s->s.getAge()<20);
        List<Student> stus2 = fileter(stus1,s->s.getChengji()>80);
        for(Student stu:stus2){
            System.out.println(stu.toString());
        }


    }
    public static List<Student> fileter(List<Student> list ,
                                        Predicate<Student> p){
        List<Student> listStu = new ArrayList<>();

        for(Student stu:list){
            if(p.test(stu))
                listStu.add(stu);
        }

        return listStu;
    }
}


class Student{
    private String name;
    private int age;
    private double chengji;

    public Student() {
    }

    public Student(String name, int age, double chengji) {
        this.name = name;
        this.age = age;
        this.chengji = chengji;
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

    public double getChengji() {
        return chengji;
    }

    public void setChengji(double chengji) {
        this.chengji = chengji;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chengji=" + chengji +
                '}';
    }
}