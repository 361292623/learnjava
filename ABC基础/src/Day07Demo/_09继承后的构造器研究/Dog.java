package Day07Demo._09继承后的构造器研究;

public class Dog extends Animal {

    public Dog() {
        // 调用父类的无参数构造器,这行代码是默认存在的可以省略不写
        // super()如果要显示的写出来，必须放在子类构造器的第一行！
        //super();
        // 子类的构造器永远会先调用一次父类的构造器，
        // 再调用自己的代码创建自己的对象。
        System.out.println("狗的无参数构造器被执行");
    }

    public Dog(String name , int age){
        // 调用父类的有参数构造器初始化对象的数据
        super(name,age);
        System.out.println("狗的有参数构造器");
    }


}
