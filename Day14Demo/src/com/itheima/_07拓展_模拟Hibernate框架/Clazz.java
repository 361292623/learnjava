package com.itheima._07拓展_模拟Hibernate框架;

public class Clazz {
    private String name ;
    private String code ;
    private int nums ;

    public Clazz(String name, String code, int nums) {
        this.name = name;
        this.code = code;
        this.nums = nums;
    }

    public Clazz() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

}
