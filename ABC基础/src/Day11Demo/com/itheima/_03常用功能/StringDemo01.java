package Day11Demo.com.itheima._03常用功能;
/*
* 判断功能的方法
*  public boolean equals (Object anObject) ：
*       将此字符串与指定对象进行比较。
*       注意：只要字符串对象的字符序列一致结果一定是true.
*       字符串的比较建议永远用equals进行比较是否相等！！
*
*   public boolean equalsIgnoreCase (String anotherString) ：
*   将此字符串与指定对象进行比较，忽略大小写
*   忽略大小写比较字符串。只关心字符是否一致！
*
*
*   注意：
*       == 只关心两个比较的对象是否是同一个。地址是否相同！
* */
public class StringDemo01 {
    public static void main(String[] args){
        String pwd1 = "itheima";
        String pwd2 = "itheima";
        String pwd3 = new String("itheima");
        System.out.println(pwd1.equals(pwd2));
        System.out.println(pwd1.equals(pwd3));

        String code = "aAB12c";
        String sysCode = "aaB12c";
        // 比较验证码常用！
        System.out.println(code.equalsIgnoreCase(sysCode));

    }
}
