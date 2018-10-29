package Day09Demo.com.itheima._01final关键字;
/*
* final修饰方法，说明这个方法是不能被重写的。
*
* 拓展方法的修饰符：
*    [修饰符] <返回值类型> 方法名称([形参列表]){
*
*    }
*
*    修饰符:public|private|protected|缺省 ，static|abstract|final
*
*       private abstract不能组合的。
*
*/
public class FinalDemo02 {

}

class Student extends Human{
   /*
    @Override
    public void run(){
        System.out.println("子类的run()方法");
    }
    */
}

class Human{
    // final修饰的父类方法
    // 说明这个方法是不能被子类重写的。
    public final void run(){
        System.out.println("父类的run()方法");
    }
}


