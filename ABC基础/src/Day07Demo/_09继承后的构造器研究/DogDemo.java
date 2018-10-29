package Day07Demo._09继承后的构造器研究;
/*
 子类的构造器永远会先调用一次父类的构造器，
 再调用自己的代码创建自己的对象。
 // 调用父类的无参数构造器是使用super()，super()默认存在的但是可以省略不写
 // super()如果要显示的写出来，必须放在子类构造器的第一行！

 总结：
    子类的构造器永远会先调用父类的构造器一次，再回来调用自己的构造器。
    super();调用父类的无参数构造器
    super([参数列表]);调用父类对应的有参数构造器。

  */
public class DogDemo {
    public static void main(String[] args){
        /*Dog taiDi = new Dog();
        taiDi.setName("泰迪犬");
        taiDi.setAge(1);
        System.out.println(taiDi.getName() + "--" + taiDi.getAge());*/

        System.out.println("-------------------------------");
        // 有参数构造器为对象直接初始化数据
        Dog jinMao = new Dog("金毛",1);
        System.out.println(jinMao.getName() + "--" + jinMao.getAge());

    }
}
