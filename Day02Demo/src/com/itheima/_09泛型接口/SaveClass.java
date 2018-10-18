package com.itheima._09泛型接口;

public class SaveClass implements SaveData<Clazz> {
    @Override
    public void save(Clazz ele) {
        System.out.println("保存班级成功!");
    }

    @Override
    public void delete(Clazz ele) {
        System.out.println("删除班级成功!");
    }
}
