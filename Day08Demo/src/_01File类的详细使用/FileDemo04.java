package _01File类的详细使用;

/*
   File文件遍历：
     File类与文件夹遍历相关方法
         public String[] list()
            * 获得文件夹下所有的文件，返回字符串数组
         public File[] listFiles()
            * 获得文件夹下所有的文件，返回文件对象数组
            注意事项：文件对象关联的路径必须是文件夹。

     以上方法默认只能获取一级文件数据。
*/

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
        // 定位源目录
        File dir = new File("D:\\itcast\\技术文档");
        // 获取D:\itcast\技术文档目录下的所有一级文件名称
        // 返回到一个字符串数组中去。
        /*String[] names =  dir.list();
        for(String name : names){
            System.out.println(name);
        }*/
        // 获取D:\itcast\技术文档目录下的所有一级文件对象。
        // 返回到一个File类型的数组中去。
        File[] files = dir.listFiles();
        for(File f : files){
            f.delete();
            System.out.println(f.getAbsolutePath());
        }
    }
}
