package Day08Demo.com.itheima._04JDK8之后的静态和默认方法;

public class PingPongMan implements SportMan {
    @Override
    public void run() {

    }

    @Override
    public void eat() {

    }

    public static void main(String[] args){
        PingPongMan zjk = new PingPongMan();
        // 实例方法必须创建对象调用
        zjk.sleep();
        // 静态方法必须用静态方法所在类的类名调用。
        SportMan.go();
    }
}
