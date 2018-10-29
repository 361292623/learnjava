package Day06Demo.com.itheima._04创建手机类;
/*
* 创建对象：做手机！
*
* */
public class TestPhone01 {
    public static void main(String[] args){
        // 创建对象：做iphone XS
        // 类名 变量 = new 构造器;
        Phone iphoneXS = new Phone();
        iphoneXS.name = "iphone XS";
        iphoneXS.brand = "苹果";
        iphoneXS.color = "黑色";
        iphoneXS.price = 11999.0 ;
        System.out.println(iphoneXS.name);
        // 对象.方法
        iphoneXS.call("王东伟");
        iphoneXS = null ;

        // 创建对象：做iphone XR
        // 类名 变量 = new 构造器;
        Phone iphoneXR = new Phone();
        iphoneXR.name = "iphone XR";
        iphoneXR.brand = "苹果";
        iphoneXR.color = "白色";
        iphoneXR.price = 8000.0;
        System.out.println(iphoneXR.name);
        // 对象.方法
        iphoneXR.call("东江");

        // 类的东西直接用类名访问
        System.out.println(Phone.schoolName);
        Phone.test();



    }
}
