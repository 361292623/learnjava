package Day11Demo.com.itheima._03常用功能;
/*
* 获取功能的方法
    public int length () ：返回此字符串的长度。
    public String concat (String str) ：将指定的字符串连接到该字符串的末尾。
    public char charAt (int index) ：返回指定索引处的 char值。
    public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
    public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符
    串结尾。
    public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到
    endIndex截取字符串。含beginIndex，不含endIndex。
*
*
*/
public class StringDemo02 {
    public static void main(String[] args){
        String name = "itheima欢迎您";
        // 1.获取字符串的长度。
        System.out.println(name.length());

        // 2.拼接字符串
       // String rs = name.concat("加入Java世界");
        String rs = name + "加入Java世界";
        System.out.println(rs);

        // 3.获取字符串中指定索引处的字符。
        char ch = name.charAt(3);
        System.out.println(ch);

        // 4.获取指定字符串在字符串中的首次出现的索引位置，
        // 如果不包含这个字符串返回-1
        System.out.println(name.indexOf("欢迎")); // 7
        System.out.println(name.indexOf("欢迎1")); // -1

        // name = "itheima欢迎您"
        // 5.从某个索引位置处开始截取剩余全部字符串！
        String rs1 = name.substring(7);
        System.out.println(rs1);

        // 6.截取字符串中的一部分字符串
        // 参数一：截取的开始索引位置（包含）
        // 参数二：截取的结束索引位置（不包含）
        String rs2 = name.substring(2,7);
        System.out.println(rs2);

    }
}
