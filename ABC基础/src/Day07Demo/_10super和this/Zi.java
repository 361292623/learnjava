package Day07Demo._10super和this;

public class Zi extends Fu{
    public int num = 222;

    public void show(){
       /* System.out.println(this.num); // 访问当前对象的num , 子类的。
        System.out.println(super.num);// 访问父类对象的num , 父类的。*/
       // this.test(); // 调用子类重写的方法
          super.test();
    }

    @Override
    public void test(){
        System.out.println("===子类test()===");
    }
}
