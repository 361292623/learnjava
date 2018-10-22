package _03文件递归搜索;

import java.io.File;
import java.io.IOException;

/*
* 文件搜索：
*    需求：请从D:\itcast\技术文档中找出所有的文件输出。
*
* */
public class FileSearchDemo01 {
    public static void main(String[] args) throws IOException {
        // 定位需要搜索的目录：
        File dir = new File("D:\\soft");
        // 定义一个方法复杂搜索这个目录下的全部文件。
        searchFile(dir,"eclipse.exe");

    }

    private static void searchFile(File dir,String fileName) throws IOException {
        // 判断是否是目录，目录是否正确
        if(dir.exists()&&dir.isDirectory()){
            // 先获取这个目录下的全部一级文件对象
            File[] files = dir.listFiles();
            // 判断dir目录下是否存在文件对象。
            if( files!=null && files.length>0 ){
                // 说明dir目录下一定存在文件
                // 遍历它下面的所有一级文件
                for(File f : files){
                    //判断这个f文件是文件还是文件夹
                    if(f.isFile()){
                        // 说明f是文件，找到了就输出
                        //System.out.println(f.getAbsolutePath());
                        if(f.getName().contains(fileName)){
                            System.out.println(f.getAbsolutePath());
                            // 启动它
                            /*Runtime run = Runtime.getRuntime();
                            run.exec(f.getAbsolutePath());*/
                        }
                    }else{
                        // 说明f是文件夹，需要继续递归寻找
                        searchFile(f,fileName);
                    }
                }
            }
        }
    }
}
