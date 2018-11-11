package com.itheima._03预编译对象;


import java.sql.Date;

/**
 * @author pkxing
 * @version 1.0
 * @Package com.itheima._03预编译对象
 * @date 2018/11/5  下午3:13
 */
public class Student {
    private int id;
    private String name;
    private String gender;
    private Date birthday;

    public Student() {
    }

    public Student(int id, String name, String gender, Date birthday) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
