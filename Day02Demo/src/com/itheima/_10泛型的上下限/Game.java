package com.itheima._10泛型的上下限;

import java.util.ArrayList;
import java.util.Collection;

/*
* 需求：
*    开发一个极品飞车的游戏。
*    极品飞车游戏的业务：
*       任何车都可以来一起参与比赛。
*
* 泛型是没有继承关系的：没有多态形式
*     虽然BMW 和 JEEP继承了Car
*     但是   ArrayList<BMW> ArrayList<JEEP> 没有继承 ArrayList<Car>
*
*   泛型通配符： ?
*       泛型类型变量：E T K V ,做泛型的时候才可以使用（创建泛型的时候才可以使用）
*       ？在使用泛型的时候使用，代表可以接收一切类型。
*
*   ? extends Car : 泛型的上限。
*       ? 必须是Car类型或者是Car的子类类型。
*
*   ? super Car : 泛型的下限。
*       ? 必须是Car类型或者是Car的父类类型。
*/
public class Game {
    public static void main(String[] args){
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        compitition(bmws);

        ArrayList<JEEP> js = new ArrayList<>();
        js.add(new JEEP());
        js.add(new JEEP());
        js.add(new JEEP());
        compitition(js);

     /*   ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        compitition(dogs);*/
    }

    // 比赛的方法。
    public static void compitition(ArrayList<? extends Car> cars){

    }
}
