package Day09Demo.com.itheima._06匿名内部类;
/*
* 匿名内部类：
*      直接去new抽象类或者是接口的所谓对象。
*
*      抽象类和接口之所以不能创建对象的原因是因为他们存在抽象方法。
*
*
         匿名内部类，没有名字的
         匿名内部类默认会返回一个当前抽象类或者接口的匿名对象。
         匿名内部类的缺点是只能使用1次
         匿名内部类的优点是代码简单，编码快速！

         匿名内部类是为了创建抽象类和接口的所谓对象。
         格式：
            new 接口｜抽象类｜普通类(){
                // 重写的方法
            };
* */
public class TestMain {
    public static void main(String[] args){
        Animal waiCai = new Dog();
        waiCai.setName("旺财");
        waiCai.run();

        // -------------泰迪-----------------------
        // 匿名内部类的方法
        // 匿名内部类，没有名字的
        // 匿名内部类默认会返回一个当前抽象类或者接口的匿名对象。
        // 匿名内部类的缺点是只能使用1次
        // 匿名内部类的有点是代码简单，编码快速！
        Animal taiDi = new Animal() {
            @Override
            public void run() {
                System.out.println(this.getName()+"狗跑的比较快");
            }
        };
        taiDi.setName("泰迪犬");
        taiDi.run();

        // -------------警犬-----------------------
        Animal jq = new Animal() {
            @Override
            public void run() {
                System.out.println(this.getName()+"狗跑的比较快");
            }
        };
        jq.setName("警犬");
        jq.run();

        // -------------普通类也可以用匿名内部类-----------------------
        Dog dog = new Dog(){
            @Override
            public void run() {
                System.out.println(this.getName()+"狗跑的像个sb!");
            }
        };
        dog.setName("小狗");
        dog.run();
    }
}

class Dog extends Animal{
    @Override
    public void run() {
        System.out.println(this.getName()+"狗跑的比较快");
    }
}
