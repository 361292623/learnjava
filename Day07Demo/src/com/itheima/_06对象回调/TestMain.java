package com.itheima._06对象回调;
/*
* 对象回调
* */
public class TestMain {
    public static void main(String[] args) {
      /*  startCook(new CookFood() {
            @Override
            public String cook(String name, String user) {
                return user+"在做"+name+"给你吃！";
            }
        },"蛋挞","徐磊");*/


       /* startCook((String name, String user) -> {
                return user+"在做"+name+"给你吃！";
        }, "蛋挞","徐磊" );

        startCook(( name,  user) -> {
            return user+"在做"+name+"给你吃！";
        }, "蛋挞","徐磊" );*/

        startCook(( name,  user) -> user+"在做"+name+"给你吃！", "蛋挞","徐磊" );
        startCook(( name,  user) -> user+"在做"+name+"给你吃！", "蛋挞","徐磊" );

    }

    public static void startCook(CookFood ck , String name
             , String user){
        String rs = ck.cook(name,user);
        System.out.println(rs);
    }
}
