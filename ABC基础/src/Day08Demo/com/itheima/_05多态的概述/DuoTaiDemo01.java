package Day08Demo.com.itheima._05多态的概述;
/*
 *  多态的来历：
 *     多态是继封装、继承之后，面向对象的第三大特性。
 *  什么是多态：
 *     （1）先从写法上识别多态。
 *          多态是在继承关系中才有的现象。
 *           Animal cat = new Cat();
 *           把子类对象赋值给父类的类型。
 *
 *     （2）从概念上理解多态
 *         编译阶段调用的是父类的方法，但是在运行时，调用的是父类变量真正
 *         所指向的子类对象重写的该方法。
 *         它这一变态行为称为多态。
 *
 *
 *  注意事项：
 *      多态的好处是右边的子类对象可以切换。
 *      多态如果使用父类类型作为方法的参数，那么父类对象，子类对象，多态类型都可以传输进来。
 *      多态的特点：编译看左边，运行看右边。
 *      多态的缺点是无法使用子类对象特有的功能！
 *
 *
 */
public class DuoTaiDemo01 {
    public static void main(String[] args){
        // 类型 变量 = new 构造器;
        Animal ni = new Cat();
        ni.sound();
        //comptition(ni);


        Animal ni1 = new Dog();
        ni1.sound();
       // comptition(ni1);

    }

    // 需求：所有的动物都可以调用下面这个方法进行比赛
    public static void comptition(Animal ni){

    }
}
