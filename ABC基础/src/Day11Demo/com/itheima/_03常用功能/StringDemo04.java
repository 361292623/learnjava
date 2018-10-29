package Day11Demo.com.itheima._03常用功能;
/*
* 分割功能的方法
*    public String[] split(String regex) ：将此字符串按照给定的regex（规则）拆分为字符串数组。
* */
public class StringDemo04 {
    public static void main(String[] args){
        String ids = "12,11,13";
        // 以什么内容把字符串分割成一个字符串数组
        String[] idArrs = ids.split(",");
        for(int i = 0 ; i < idArrs.length ; i++) {
            System.out.println(idArrs[i]);
        }

        String names = "李东江@王东伟@陈美军";
        String[] namesArr = names.split("@");
        for(int i = 0 ; i < namesArr.length ; i++) {
            System.out.println(namesArr[i]);
        }
    }
}
