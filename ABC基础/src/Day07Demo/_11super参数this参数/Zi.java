package Day07Demo._11super参数this参数;
/*
* super(参数)：调用父类的构造器
* this(参数) ： 调用本类的其他构造器，用其他构造器的功能！
* 具体调用谁，根据参数决定的。
*
* */
public class Zi extends Fu{
 /*   public Zi() {
        super(); // 默认就有的，默认调用父类的无参数构造器
        //super("张三"); //调用父类的有参数构造器
        System.out.println("子类的无参数构造器");
    }*/

    public Zi(){
        this("张三"); // 调用自己类中的其他构造器！
        System.out.println("子类的无参数构造器");
    }

    public Zi(String name){
        System.out.println("子类的有参数构造器"+name);
    }


    public static void main(String[] args){
        Zi zi = new Zi();
    }
}
