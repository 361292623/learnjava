package com.itheima._04对象序列化和反序列化概述;

import java.io.Serializable;

public class Clazz implements Serializable{
    private String name;
    private String code ;

    public Clazz(String name, String code) {
        this.name = name;
        this.code = code;
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

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
