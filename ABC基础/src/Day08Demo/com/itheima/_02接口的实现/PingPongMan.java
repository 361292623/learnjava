package Day08Demo.com.itheima._02接口的实现;
/*
   接口：接口体现的是规范，实现接口的类，必须要实现接口中所有方法。
*
*  实现接口：
*     格式：
*     [修饰符] class <类名> implements 接口1 , 接口2 , 接口3 , ..{
*
*     }
*
*  注意：
*     （1）一个类如果实现了接口，必须重写接口中所有的抽象方法,此时这个类称为实现类。
*         如果这个类不重写所有的抽象方法，这个类必须成为抽象类。
*
*     （2）接口是可以多实现类，一个类可以实现多个接口。
*
* */
public class PingPongMan implements SportMan , LawInterface {

    @Override
    public void noBattle() {
        System.out.println("运动员禁止打架斗殴！");
    }

    @Override
    public void run() {
        System.out.println("运动员必须跑步！");
    }

    @Override
    public void eat() {
        System.out.println("运动员必须吃好喝好！");
    }

    @Override
    public String compition(String name, String country) {
        return name + "去" + country + "参加比赛";
    }

    public static void main(String[] args){
        PingPongMan zjk = new PingPongMan();
        zjk.run();
        zjk.eat();
        System.out.println(zjk.compition("张继科","美国"));
    }


}
