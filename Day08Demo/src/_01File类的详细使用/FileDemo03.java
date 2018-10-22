package _01File类的详细使用;

import java.io.File;
import java.io.IOException;

/*
* 文件的创建方式：
*   public boolean createNewFile()
    public boolean delete()
    public boolean mkdir()
    public boolean mkdirs()

      File类与创建和删除相关的方法
         public boolean createNewFile()
            * 根据文件路径创建文件，如果文件存在，则什么也不发生，返回false。
            * 创建成功返回true，否则false
            * 只能用来创建文件，不能创建文件夹。

         public boolean delete()
            * 删除文件，删除成功返回true，否则false。
            * 如果是文件夹，则只能删除空文件夹。

         public boolean mkdir() ==> make directory
            * 创建单级文件夹,创建成功返回true，否则false
            * 如果文件夹存在，则不创建了，返回false
            * 只能创建文件夹，不能创建文件。

         public boolean mkdirs()
             * 创建多级文件夹,创建成功返回true，否则false
             * 如果文件夹存在，则不创建了，返回false
             * 只能创建文件夹，不能创建文件。
*
* */
public class FileDemo03 {
    public static void main(String[] args) throws Exception {
        // 使用相对路径。
        File f = new File("src/out.txt");
        // 判断这个f文件是否存在
        if(!f.exists()){
            // 文件不存在，需要创建
            // 创建成功返回true
            // 创建失败返回false , 路径写错或者文件已经存在会创建失败。
            // 只能用来创建文件，不能创建文件夹。
            // 这个方法：几乎不用。
            System.out.println(f.createNewFile());
        }

        // 删除文件
        // 删除成功返回true ,删除失败返回false
        //System.out.println( f.delete());

        File f1 = new File("D:\\itcast\\技术文档\\ooo");
        // 创建文件夹
        // 创建成功返回true 创建失败返回false
        // 只能创建一级文件夹，不能创建多级文件夹，只能创建文件夹不能创建文件。
        System.out.println(f1.mkdir());

        File f2 = new File("D:\\itcast\\技术文档\\rrr\\ttt\\yyy\\uuu\\iii");
        // 创建文件夹
        // 创建成功返回true 创建失败返回false
        // 只能创建多级文件夹，只能创建文件夹不能创建文件。
        System.out.println(f2.mkdirs());


        File f3 = new File("D:\\itcast\\技术文档\\rrr");
        // 删除文件夹
        // delete只能删除空文件夹。
        System.out.println(f3.delete());

    }
}
