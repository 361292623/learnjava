package Day08Demo.com.itheima._06多态的类型转换;
/*
* 多态中的类型转换问题：
*     总结：
*        （1） 子类对象是可以直接赋值给父类类型的（自动转型）
*        （2） 有继承关系的两个类一定可以进行强制类型转换
*             编译阶段绝对不会报错
*             运行阶段可能出现类型转换异常。
*
* */
public class TestMain {
    public static void main(String[] args){
        // 创建一个猫对象
        // 自动转型 ： 向上转型。
        // Animal 动物的范围大
        // Cat    猫的范围小
        Animal n = new Cat();
        n.sound();
        // 自动转型的缺点：不能使用猫的独有功能（抓老鼠）

        // 强制转换：
        // 类型 变量 = (类型)(变量，数据);
        // n是父类类型，范围大
        // cat是子类类型，范围小
        Cat cat = (Cat)n;
        cat.sound();
        cat.catchMouse();

        // ---------------------------------------
        System.out.println("---------------------------");
        Animal n1 = new Dog(); // 自动转型

        // 只要有继承关系就可以强制转换，编译阶段一定不会报错！
        // 运行阶段会出现：ClassCastException 类型转换异常！
        //Cat cat2 = (Cat) n1;

        // 避免强制类型转换异常：事先加上判断
        // 假如想把n1转成猫类型：事先判断n1具体的对象是否真的是猫类型。
        // instanceof :n1必须是Cat类型的对象，或者是Cat子类类型的对象。
         System.out.println(n1 instanceof Cat); // false
        // instanceof :n1必须是Dog类型的对象，或者是Dog子类类型的对象。
         System.out.println(n1 instanceof Dog); // true



    }
}
