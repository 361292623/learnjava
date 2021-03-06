package Day07Demo._08方法重写;
/*
* 方法重写：
*    发生在子父类之间的关系。
*    方法重写的含义：子类继承了父类的方法，但是子类觉得父类的这个
*                 方法不足以满足自己的需求，子类重新写了一个
*                 父类同名的方法，以便覆盖父类的该方法。
*                 这就是方法重写。
*
*   @Override:注解，重写注解校验！
*      这个注解标记的方法，就说明这个方法必须是重写父类的方法，否则报错。
*      建议重写都加上这个注解
*
*   方法重载与方法重写的区别：
*      方法重载：两同一不同
*         方法重载必须在同一个类中，
*         方法名称必须相同
*         形参列表必须不同。
*     方法重写：
*          发生在子父类中的关系。
*          方法名称必须相等。
*          形参列表也必须相同。
*
*
*
* */
public class Zi extends Fu {
    // 声明不变，重新实现
    // 方法名称与父类全部一样，只是方法体重的功能重写写了！
    @Override
    public void eat(){
        System.out.println("我可以吃很多的东西，很能吃！！！");
    }
}
