package com.itheima._09泛型接口;

public class SaveStudent implements SaveData<Student> {
    @Override
    public void save(Student ele) {
        System.out.println("保存学生成功!");
    }

    @Override
    public void delete(Student ele) {
        System.out.println("删除学生成功!");
    }
}
