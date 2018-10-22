package _01File类的详细使用;

import java.io.File;
import java.text.SimpleDateFormat;

/*
* File类的研究：
*    Java使用File类来代表文件（文件，文件夹）
*    广义来说：文件和文件夹操作系统都认为是文件。
*
*    File的核心：通过创建File对象来代表操作系统具体的一个文件，
*               然后通过操作File对象，达到操作文件的目的。
*               获取文件的大小
*               删除文件
*               判断文件的类型（是文件，还是文件夹）
*               获取文件的修改时间
*               创建文件
*               创建文件夹
*               ...
*
* File文件对象的创建：
*    构造器：
*      （1） public File(String pathname)  ： 用的最多。
*      （2） public File(File parent,String child)
*      （3） public File(String parent,String child)
*
*    a.按照路径划分：
*       File f = new File("绝对路径/相对路径");
*         -- 绝对路径：是从盘符的根路径开始寻路一直定位到当前文件的完整路径。
*                    绝对路径是带盘符的。
*
*         -- 相对路径：默认是相对到当前项目路径下的。
*                    不带盘符的。
*                    相对路径用于定位项目中的文件（重要）
*
*         绝对路径：是依赖于当前操作系统环境的，在其他环境可能运行失败。
*         相对路径：在任何环境下都可以运行，不依赖与操作系统的。
*                 相对路径只能用在定位项目中的文件。
*         结论：项目中的文件建议全部用相对路径去定位。
*
*
*    获取功能API:
*       public String getAbsolutePath()
        public String getPath()
        public String getName()
        public long length()
        File getParentFile()
        long lastModified()
*
*/
public class FileDemo01 {
    public static void main(String[] args) {
        // 1创建一个文件对象:代表操作系统的一个具体文件。
        /*
        * 路径分隔符：
        *    \ : 在Java中\是特殊字符，\n(换行) \t(空格)
        *        Java认为如果\就只想作为一个分隔符。
        *        应该在\的前面再加上一个\
        *        \\ ： \是说明后面的\就是一个分隔符(转义)
        *    /： 可以直接使用
        */
        File f = new File("D:\\itcast\\技术文档\\dlei.txt");

        // public File(String parent,String child)
        File ff1 = new File("D:\\itcast\\技术文档\\" ,"dlei.txt");

        // public File(File parent,String child)
        File pf = new File("D:\\itcast\\技术文档\\" );
        File ff2 = new File(pf ,"dlei.txt");


        // 获取文件的属性信息
        // 获取文件的绝对路径。
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());

        // 获取文件名称，带文件后缀的。
        System.out.println(f.getName());

        // 获取文件的大小：返回的是字节大小。
        long size = f.length();
        System.out.println(size);

        // 获取父级文件路径
        System.out.println(f.getParent());

        // 获取父级文件对象
        File parentFile = f.getParentFile();
        System.out.println(parentFile);

        // 获取文件最后的修改时间
        long lastTime = f.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
        System.out.println(sdf.format(lastTime));

        System.out.println("--------------------------------------------");
        // 相对路径
        File f1 = new File("xlei.txt");
        // 获取绝对路径
        System.out.println(f1.getAbsolutePath());
        // 写的时候是什么路径就拿什么路径给你
        System.out.println(f1.getPath());
        System.out.println(f1.length());

        File f2 = new File("src/dlei.txt");
        System.out.println(f2.getAbsolutePath());
        // getPath : 写的时候是什么路径就拿什么路径给你
        System.out.println(f2.getPath());
        System.out.println(f2.length());

    }
}
