

import myfilecopy.FileUtils;

import java.io.File;



public class CopyDirectory {

    public static void main(String[] args) throws Exception {
       // org.apache.commons.io.FileUtils.
        // copyDirectory(sourcePackageFile,destinationPackageFile);
        System.out.println("开始");
        long start = System.currentTimeMillis();
        File inFile =new File("d:\\Users\\XC-P\\Desktop\\新建1");
        File outFile =new File("d:\\Users\\XC-P\\Desktop\\新建2");
        FileUtils.copyDirectory(inFile,outFile);
        long end = System.currentTimeMillis();
        System.out.println("结束"+"耗时："+(end-start));

    }

 }