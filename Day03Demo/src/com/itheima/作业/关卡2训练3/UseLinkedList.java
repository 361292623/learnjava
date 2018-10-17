package com.itheima.作业.关卡2训练3;


import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","67891","2347809933",
                "98765432102","67891","12347809933"};
        LinkedList<String > lhs = new LinkedList<>();
        for (String str : strs){
            lhs.addFirst(str);
            for (String str1 : lhs){

                if(!str1.equals(str)){
                    lhs.addFirst(str);
                }
            }
        }
        System.out.println(lhs);
        }




    }

