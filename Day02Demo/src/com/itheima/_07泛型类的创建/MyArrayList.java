package com.itheima._07泛型类的创建;

import java.util.ArrayList;

// 泛型类
//
public class MyArrayList<E> {

    private ArrayList arrayList = new ArrayList();

    public void add(E ele){
        arrayList.add(ele);
    }

    public boolean remove(E e){
        return arrayList.remove(e) ;
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }
}
