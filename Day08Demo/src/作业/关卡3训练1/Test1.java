package 作业.关卡3训练1;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("Day02Demo\\src\\com\\itheima");
        //System.out.println(file.exists());
        listF(file);



    }

    public static void listF(File file){
        File[] filesList = file.listFiles();//用于保存文件夹
        //File[] filesListJava = file.listFiles((pathname)-> pathname.getName().endsWith(".java"));//用于保存java文件名
        if (file.isDirectory()){
        for (File f : filesList){
            listF(f);
            if(f.isFile() && f.length()<81){
            System.out.println(f.getName());
            }
        }
        }


    }

}
