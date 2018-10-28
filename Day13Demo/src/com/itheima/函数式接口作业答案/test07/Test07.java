package com.itheima.函数式接口作业答案.test07;

import java.util.function.Predicate;

/**
 已知有String[] arr = {"我爱黑马","999","华莱士","你好我是黑马酱","传智itcast","","400cc","i love java","5566778","黑马itheima"};
 a)	使用lambda表达式创建Predicate对象p1,p1能判断字符串是否包含"黑马"
 b)	使用lambda表达式创建Predicate对象p2,p2能判断字符串长度是否大于等于4
 c)	使用lambda表达式创建Predicate对象p3,p3能判断字符串长度是否小于等于6
 d)	使用lambda表达式创建Predicate对象P4,p4能判断字符串的内容是不是一个整数(例如"234")
 e)	遍历arr，利用已创建的Predicate对象(不使用任何逻辑运算符)，从数组中取出满足如下条件的元素并打印
     i.长度小于4的字符串
     ii.内容是一个int数并且长度小于等于6的字符串  p4.and(p3).test()
     iii.内容包含黑马或者长度在4-6之间的字符串   p1.or(p2.and(p3)).test()
 */
public class Test07 {
    public static void main(String[] args){
        String[] arr = {"我爱黑马","999","华莱士","你好我是黑马酱","传智itcast","",
                "400cc","i love java","5566778","黑马itheima"};
        // boolean test(String str)
        Predicate<String> p1 = (s) -> s.contains("黑马");
        Predicate<String> p2 = (s) -> s.length() >= 4;
        Predicate<String> p3 = (s) -> s.length() <= 6;

        // 正则表达式
        // System.out.println("32131313".matches("\\d+")); // true / false

        Predicate<String> p4 = (s) -> {
            try{
                int i = Integer.parseInt(s);
                return true;
            } catch (Exception e){
                return false;
            }
        };

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            // 长度小于4的字符串
            if (p2.negate().test(s)){
                System.out.println("长度小于4的字符串：" + s);
            }
            //内容是一个int数并且长度小于等于6的字符串
            if (p4.and(p3).test(s)){
                System.out.println("内容是一个int数并且长度小于等于6的字符串:"+s);
            }
            // 内容包含黑马或者长度在4-6之间的字符串
            if (p1.or(p2.and(p3)).test(s)){
                System.out.println("内容包含黑马或者长度在4-6之间的字符串:" + s);
            }
        }
    }
}
