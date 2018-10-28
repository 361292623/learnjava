package com.itheima._03函数式接口作为方法的参数_对象回调;
/*
* 函数式接口作为方法的参数_对象回调
*
* */
public class FuntionalInterfaceDemo01 {
    public static void main(String[] args) {
       /*
        CookFood ck = new CookFood() {
            @Override
            public void cook(String name, String user) {
                System.out.println(user+"做"+name+"吃！");
            }
        };
        startCook(ck,"生蚝","猪八戒");
        */

        /*startCook(new CookFood() {
            @Override
            public void cook(String name, String user) {
                System.out.println(user+"做"+name+"吃！");
            }
        },"生蚝","猪八戒") ;*/

       /* startCook((String name, String user) -> {
                System.out.println(user+"做"+name+"吃！");
        },"生蚝","猪八戒") ;*/

       /* startCook(( name,  user) -> {
            System.out.println(user+"做"+name+"吃！");
        },"生蚝","猪八戒") ;*/

        startCook(( name,  user) ->  System.out.println(user+"做"+name+"吃！") ,"生蚝","猪八戒") ;

    }

    /* 开始做饭的方法！
    *  参数一：函数式接口匿名对象。
    *  参数二：食物
    *  参数三：主人
    * */
    public static void startCook(CookFood ck , String name , String user){
        ck.cook(name,user);
    }
}

// 函数式接口
@FunctionalInterface
interface CookFood{
    void cook(String name, String user);
}
