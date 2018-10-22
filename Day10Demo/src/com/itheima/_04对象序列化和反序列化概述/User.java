package com.itheima._04对象序列化和反序列化概述;

import java.io.Serializable;

/*
*
* */
public class User implements Serializable{

    // 对象是需要指定序列化版本号
    // 自定义序列号格式：
    private static final long serialVersionUID = 1L;

    private String name ;
    private String loginName ;
    // transient 修饰的成员变量不参与序列化。
    private transient String passWord ;
    private char sex ;
    // 班级
    private Clazz clazz ;

    public User(String name, String loginName, String passWord, char sex, Clazz clazz) {
        this.name = name;
        this.loginName = loginName;
        this.passWord = passWord;
        this.sex = sex;
        this.clazz = clazz;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex=" + sex +
                ", clazz=" + clazz +
                '}';
    }
}
