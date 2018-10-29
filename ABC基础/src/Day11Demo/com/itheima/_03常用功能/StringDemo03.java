package Day11Demo.com.itheima._03常用功能;
/*
* 转换功能的方法
public char[] toCharArray () ：将此字符串转换为新的字符数组。
public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。
public String toLowerCase() ：使用默认语言环境的规则将此 String所有字符转换为小写。
public String toUpperCase() ：将此 String所有字符转换为大写，使用默认语言环境的规则。
public String replace (CharSequence target, CharSequence replacement) ：将与target匹配的字符串使
用replacement字符串替换
*             replaceAll
*
* */
public class StringDemo03 {
    public static void main(String[] args){
        String name = "abc我爱你";
        // 1.把字符串直接转成一个字符数组
        char[] chs = name.toCharArray();
        for(int i = 0 ; i < chs.length ; i++ ){
            char ch = chs[i];
            System.out.print(ch+" ");
        }

        System.out.println(); // 换行

        // 2.获取字符串的字节数组
        byte[] buffer = name.getBytes();
        //System.out.println(buffer.length);
        for(int i = 0 ; i < buffer.length ; i++ ){
            byte ch = buffer[i];
            System.out.print(ch+" ");
        }

        System.out.println(); // 换行


        // 3.把字符串小写
        String name1 = "ITHeimA欢迎您！LOVE you!";
        String rs2 = name1.toLowerCase();
        System.out.println(rs2);

        // 4. 把字符串大写
        String rs3 = name1.toUpperCase();
        System.out.println(rs3);

        // 5.替换内容！
        String str = "我觉得你好sb,你要努力不要做sb,我看好你！";
        String rs4 = str.replace("sb","**");
        System.out.println(rs4);



    }
}
