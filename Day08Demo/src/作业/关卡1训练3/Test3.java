package 作业.关卡1训练3;

import java.io.File;
import java.io.IOException;

public class Test3 {

        public static void main(String[] args) throws IOException {
            File f = new File("aaa\\bbbb\\dddd");
            if(!f.exists()){
                //System.out.println(f.mkdirs());
            }
           // System.out.println(f);
           // System.out.println("是否存在"+f.exists());

            File f1= new File("D:\\Users\\XC-P\\Desktop\\黑马99\\就业班-day06-线程、同步\\笔记");
         /*   File f1= new File(f,"12345");
            String[] dirStr = f1.list();
            System.out.println(f1);*/
            dirDeleter(f1);
        }


       public static Boolean dirDeleter(File dir) {
           String[] dirStr = dir.list();
           //System.out.println(dir);
           if (dir.isDirectory()) {

               for (String s : dirStr) {
                   dirDeleter(new File(dir, s));
                   System.out.println("目录"+dir+"\\"+s);
               }
           }
           //return dir.delete();
           return true;

       }
    }

