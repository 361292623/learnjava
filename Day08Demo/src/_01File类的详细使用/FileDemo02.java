package _01File类的详细使用;

import java.io.File;

/*
* 文件对象的创建方式：
*   File文件对象的创建：
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
 *    b.按照文件的类型划分：
 *       File f = new File("文件/文件夹");
 *
 *      public boolean exists()
        public boolean isDirectory()
        public boolean isFile()
 *
 */
public class FileDemo02 {
    public static void main(String[] args) {
        // 创建文件对象
        // 创建一个文件对象：相对路径方式
        File f = new File("src/dlei.txt");
        // 判断f是否存在，判断路径是否正确,存在返回true,不存在返回false
        System.out.println(f.exists());
        // 判断f是否是文件 isFile
        // f是文件返回true,不是文件返回false
        System.out.println(f.isFile());
        // 判断f是否是文件夹 isDirectory
        // f是否是文件夹，是文件夹返回true,不是文件夹返回false
        System.out.println(f.isDirectory());

        System.out.println("-----------------------------");
        // 创建一个文件夹对象
        File f1 = new File("D:\\itcast\\班级");
        // 判断f1是否存在，判断路径是否正确,存在返回true,不存在返回false
        System.out.println(f1.exists());
        // 判断f1是否是文件 isFile
        // f1是文件返回true,不是文件返回false
        System.out.println(f1.isFile());
        // 判断f1是否是文件夹 isDirectory
        // f1是否是文件夹，是文件夹返回true,不是文件夹返回false
        System.out.println(f1.isDirectory());


    }
}
