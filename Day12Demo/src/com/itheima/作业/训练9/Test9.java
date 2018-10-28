package com.itheima.作业.训练9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Test9 {
    public static void main(String[] args) {

        List<Student> list = new ArrayList();
        list.add(new Student("谢霆锋", 85));
        list.add(new Student("章子怡", 63));
        list.add(new Student("刘亦菲", 77));
        list.add(new Student("黄晓明", 33));
        list.add(new Student("岑小村", 92));

//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getScore()-o2.getScore();
//            }
//        });
 //       Collections.sort(list,(o1, o2) -> o1.getScore()-o2.getScore());
        Collections.sort(list,Student::compare);
        for (Student stu: list){
            System.out.println(stu);
        }
    }
}
