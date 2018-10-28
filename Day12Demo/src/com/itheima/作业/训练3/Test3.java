package com.itheima.作业.训练3;

public class Test3 {
    public static void main(String[] args) {
//        decToHex(700, new NumberConversion() {
//            @Override
//            public String convert(int num) {
//                return Integer.toHexString(num);
//            }
//        });
        decToHex(700, Integer::toHexString);
    }
    static void decToHex(int num ,NumberConversion nc){
        System.out.println(nc.convert(num));
    };

}

interface NumberConversion {
    String convert(int num);
}