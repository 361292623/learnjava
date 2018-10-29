package Day08Demo.com.itheima._07能够完成笔记本电脑案例;
/*
*
* 鼠标： USB规范的实现商。
*
* */
public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("我是小米厂商设计的鼠标，对接USB规范成功！");
    }

    @Override
    public void close() {
        System.out.println("我是小米厂商设计的鼠标，拔出鼠标！");
    }

    public void click(){
        System.out.println("小米鼠标随便单击！");
    }
}
