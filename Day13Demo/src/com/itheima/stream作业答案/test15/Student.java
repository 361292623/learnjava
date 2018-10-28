package com.itheima.stream作业答案.test15;

/**
 * @author pkxing
 * @version 1.0
 * @Package com.itheima.test15
 * @date 2018/5/14  上午10:34
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
