package com.itheima.作业;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test15 {
    public static void main(String[] args){
        List<String> one = new ArrayList<>();
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("冯默风1");
        one.add("程英");
        List<String> two = new ArrayList<>();
        two.add("宋远桥");
        two.add("俞莲舟");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");

        Stream<String> streamOne = one.stream().filter(s->s.length()==3).limit(6);
        Stream<String> streamTwo = one.stream().filter(s->s.startsWith("张")).skip(1);
        Stream<String> stream3 = Stream.concat(streamOne,streamTwo);
        stream3.map(s->new Student(s)).forEach(System.out::println);
    }
}

  class Student {
     private String name;

     public Student(String name) {
         this.name = name;
     }

     public Student() {
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 '}';
     }
 }