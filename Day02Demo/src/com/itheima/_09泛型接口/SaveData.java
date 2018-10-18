package com.itheima._09泛型接口;
/*
* 泛型接口：
*    一个接口如果使用了泛型就是泛型接口
*
* 接口格式：
*    [修饰符] interface 接口名称<泛型变量>{
*
*    }
*
*    泛型变量 ： E T K V
*
* 需求：教务系统，存数据(学生 ， 班级 , ...)
*
* */
public interface SaveData<E> {
    void save(E ele);
    void delete(E ele);
}
