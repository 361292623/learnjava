package com.itheima._07拓展_模拟Hibernate框架;

public class User {
    private String cardId ;
    private int age ;
    private char sex ;
    private String addr ;

    public User() {
    }

    public User(String cardId, int age, char sex, String addr) {
        this.cardId = cardId;
        this.age = age;
        this.sex = sex;
        this.addr = addr;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
