package _04文件过滤器;

import java.io.File;
import java.io.FileFilter;

/*
* 文件过滤器：(FileFilter)
*     就是在遍历文件的时候选择出自己想要的文件。
*
*       File[] listFiles(FileFilter filter)
*       根据文件过滤器获得所有文件
*
* */
public class FileInFilterDemo01 {
    public static void main(String[] args) {
        //需求
      /*  File dir = new File("D:\\itcast\\技术文档");
        // 获取一级目录
        File[] files = dir.listFiles();
        if(files!=null && files.length > 0){
            for(File f : files){
                if(f.getName().endsWith(".java")){
                    System.out.println(f);
                }
            }
        }*/

        File dir = new File("D:\\itcast\\技术文档");
        // 获取一级目录
//        File[] files = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File f) {
//                // 自动把所有的一级文件一个一个的传输过来问你想不想要。
//              /*  if(f.getName().endsWith(".java")){
//                    return true;
//                }
//                return false;*/
//              return f.getName().endsWith(".java");
//            }
//        });

       /* File[] files = dir.listFiles( f -> {
              return f.getName().endsWith(".java");
        });*/

        File[] files = dir.listFiles( f -> f.getName().endsWith(".java"));

        for(File f : files){
            System.out.println(f.getAbsolutePath());

        }

    }
}
