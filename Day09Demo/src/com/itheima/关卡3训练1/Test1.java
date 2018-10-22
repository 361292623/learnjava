package com.itheima.关卡3训练1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    static int coutJava = 0;
    static Map<String,Integer> map = new HashMap<>();
    public static void main(String[] args) throws Exception {


        File fileInt = new File("D:\\JAVA\\JAVA1");
        File fileOut = new File("D:\\JAVA\\JAVA2");

        copyFile(fileInt,fileOut);
        System.out.println("文件数"+coutJava);

    }

    public static int copyFile(File intFile,File outFile) throws Exception{

        FileInputStream fis = null;
        FileOutputStream fos =null;
        if(intFile.exists()&&intFile.isDirectory()
              && intFile.getAbsolutePath()!=outFile.getAbsolutePath() ){
            File[] files = intFile.listFiles();
            if(files!=null && files.length>0 ){
            for (File f : files){               //遍历文件夹
                copyFile(f,outFile);
            }
            }
        }else if(intFile.exists()&&intFile.isFile()){

            if (intFile.getName().endsWith(".java")){

               String fileName = compareName(intFile.getName().substring(0,intFile.getName().length()-5));

                try {
                    fis = new FileInputStream(intFile.getPath()) ;
                    System.out.println(intFile.getPath());
                    System.out.println(outFile.getPath());

                    fos = new FileOutputStream(outFile.getPath()+"\\"+fileName+".java");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                int i = -1;
                while ((i=fis.read())!=-1){
                    fos.write(i);
                }
                fos.close();
                fis.close();
                coutJava++;
            }
        }


        return coutJava;
    }


    public static String compareName(String name){ //用于比较文件名是否重复

        if(map.containsKey(name)){
            map.replace(name,map.get(name)+1);
            return name+"("+map.get(name)+")";
        }else {
            map.put(name,1);
            return name;
        }


    }
}
