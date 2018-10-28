package com.itheima.作业.训练9;
/*a) 成员变量 姓名：String name;
b) 成员变量 成绩：int score；
c) 无参及满参数构造
d) 重写toString()*/
public class Student {
    private String name;
    private int score;

    public Student() {
        }

    public Student(String name, int score) {

        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public static int compare(Student o1, Student o2){
     return -(o1.getScore()-o2.getScore());
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
