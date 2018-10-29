package Day08Demo.com.itheima._07能够完成笔记本电脑案例;
/*
 *  电脑：组装商，产品商。一站式方案
 */
public class ComputerDemo {
    private String name ;

    public ComputerDemo() {

    }

    public ComputerDemo(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(this.name+"启动成功！");
    }

    // 电脑需要一个外设：鼠标和键盘
    public void install(USB usb){
        usb.open();
        // 使用的功能是不一样的
        // 鼠标可以点击
        // 键盘可以敲打
        // 判断安装的usb到底是键盘还是鼠标
        if(usb instanceof Mouse){
            // 强制转换
            Mouse m = (Mouse) usb;
            m.click();
        }else if(usb instanceof KeyBoard){
            KeyBoard k = (KeyBoard) usb;
            k.code();
        }

        usb.close();
    }

    public static void main(String[] args){
        ComputerDemo call = new ComputerDemo("Mac Pro");
        call.run();

        //USB mouse = new Mouse();
        USB keyBoard = new KeyBoard();
        call.install(keyBoard);
    }

}
