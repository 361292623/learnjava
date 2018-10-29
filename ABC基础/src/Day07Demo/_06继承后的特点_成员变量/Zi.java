package Day07Demo._06继承后的特点_成员变量;
/*
* 子类 == 基类 == （小类：我说的）
*
*
* */
public class Zi extends Fu {
    private int num = 222 ;

    private String name = "黑马";

    public void show(){
        // 此时优先使用子类同名的成员变量
        System.out.println("zi num:"+num);
        System.out.println("zi name:"+name);
        System.out.println("zi name1:"+name1);
    }
}
