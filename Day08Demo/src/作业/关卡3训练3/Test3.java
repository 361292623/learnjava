package 作业.关卡3训练3;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pathName ;
        File file1 = null;
        while (true) {
            System.out.println("请输入路径：");
             pathName = scanner.nextLine();

            File file = new File(pathName);
            if(!file.exists()){
                System.out.println("该文件夹或文件不存在");
                file=null;
                continue;
            }
            if(!file.isDirectory()){
                System.out.println("输入的不是文件夹路径");
                file=null;
                continue;
            }else {
                break;
            }


        }
        file1= new File(pathName);

        Map<String,Integer> map = new LinkedHashMap<>();
        mapFile(map,file1);
    }


    private static Map<String,Integer> mapFile (Map<String,Integer> map,File file){

        File[] files = file.listFiles();
        for (File f : files){
            if (f.isDirectory()){
                mapFile(map,f);
            }else if(f.isFile()){
               String key = f.getName().substring(f.getName().indexOf('.')+1);//取文件扩展名
                if (map.containsKey(key)){
                    map.replace(key,map.get(key)+1);
                }else {
                    map.replace(key,1);
                }

            }
        }
        return map;
    }
}
