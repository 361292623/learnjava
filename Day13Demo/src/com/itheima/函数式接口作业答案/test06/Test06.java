package com.itheima.函数式接口作业答案.test06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 设计一个学生类，该类包含三个字段：学生姓名，学生年龄，学生成绩。

 根据不同的条件对学生的信息进行过滤。 最后返回相应的结果。条件如下：

 （1）年龄小于20岁的。

 （2）成绩大于80分的。

 */
public class Test06 {
    public static void main(String[] args){
        // 创建集合存储学生对象
        List<Student> stus = new ArrayList<>();
        stus.add(new Student("jack",23,100));
        stus.add(new Student("rose",18,98));
        stus.add(new Student("lily",25,88));
        stus.add(new Student("lucy",16,60));


        /*
        // 年龄小于20岁的，返回一个集合
        List<Student> list1 = findByAge(stus);
        // 成绩大于80分的，返回一个集合。
        List<Student> list2 = findByScore(stus);
        */

        // 年龄小于20岁的，返回一个集合
        List<Student> list1 = fileter(stus, stu-> stu.getAge() < 20);
        // 成绩大于80分的，返回一个集合。
        List<Student> list2 = fileter(stus, stu-> stu.getScore() > 80);

        System.out.println(list1);
        System.out.println(list2);
    }

    // ****************** lambda做法 *************************
    public static  List<Student> fileter(List<Student> stus, Predicate<Student> predicate){
        // 创建集合存储学生对象
        List<Student> list = new ArrayList<>();
        for (Student stu: stus) {
            // 判断学生是否满足条件
            if (predicate.test(stu)) {
                // 将学生对象添加到集合中
                list.add(stu);
            }
        }
        return  list;
    }

    // ****************** 传统做法 *************************
    /**
     * 成绩大于80分的，返回一个集合。
     * @param stus
     * @return
     */
    public static  List<Student> findByScore(List<Student> stus){
        // 创建集合存储学生对象
        List<Student> list = new ArrayList<>();
        for (Student stu: stus) {
            if(stu.getScore() > 80) {
                list.add(stu);
            }
        }
        return  list;
    }

    /**
     * 筛选小于20岁的学生
     * @param stus
     * @return
     */
    public static List<Student> findByAge(List<Student> stus){
        // 创建集合存储学生对象
        List<Student> list = new ArrayList<>();
        for (Student stu: stus) {
            if(stu.getAge() < 20) {
                list.add(stu);
            }
        }
        return  list;
    }
}

class Student{
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student() {
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
