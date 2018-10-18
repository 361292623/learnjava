package com.itheima._09泛型接口;

public class TestMain {
    public static void main(String[] args){
        SaveStudent save = new SaveStudent();
        save.save(new Student());
        save.delete(new Student());

        SaveClass saveClass = new SaveClass();
        saveClass.save(new Clazz());
        saveClass.delete(new Clazz());
    }
}
