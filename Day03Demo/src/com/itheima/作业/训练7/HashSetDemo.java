package com.itheima.作业.训练7;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("第1");
        hs.add("第1");
        hs.add("第2");
        hs.add("第3");
        hs.add("第4");
        hs.add("第5");
        hs.add("第6");

        System.out.println("长度："+hs.size());
        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



        HashSet<Person> per = new HashSet<>();
        Person p1 =   new Person("张6",6);
        Person p2 =   p1 ;

           per.add(new Person("张1",1));
           per.add(new Person("张1",1));
           per.add(new Person("张3",3));
           per.add(new Person("张4",4));
           per.add(new Person("张5",5));
           per.add(p1);
           per.add(p2);

        System.out.println("--------------------------");
        System.out.println("长度："+per.size());
        Iterator<Person> it1 = per.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next().toString());
        }


        System.out.println(p1.hashCode());;
        System.out.println(p2.hashCode());;



    }
}
