package com.itheima._05Lambda表达式的延迟执行;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;

/*
* Lambda表达式的延迟执行:
*    (1)这是新技术的特性。
*    (2)提高代码的性能，节约资源。
*
*    使用lambda表达式的主要原因是：
*        将代码的执行延迟到一个合适的时间点。
*        所有的lambda表达式都是延迟执行的。
*
*    优化方案：
*/
public class LamdbaDemo02 {
    public static void main(String[] args) throws Exception {
        String name = "徐磊";

        // 记录登录的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
        String loginTime = sdf.format(System.currentTimeMillis());

        // 做什么
        String msg = "登录系统！";

       /*
         延迟加载
        saveLog(2, new BuildLog() {
            @Override
            public void save() {
                // 延迟加载
                saveFile(name + "在" + loginTime + msg);
            }
        });*/

        // 延迟加载:简化代码的操作
        saveLog(2, () -> saveFile(name + "在" + loginTime + msg)  );
    }


    /*
     *
     *
     */
    public static void saveLog( int logType  , BuildLog bl) throws Exception {
        if(logType == 1){
            bl.save();
        }
    }

    // 把日志保存到文件的方法！
    private static void saveFile(String messager) {
        try{
            System.out.println("执行拼接日志！");
            OutputStream os = new FileOutputStream("src/log.log",true);
            PrintStream ps = new PrintStream(os);
            // 延迟执行的！
            ps.println();
            ps.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

// 1.定义一个函数式接口用于延迟执行日志信息的拼接。
@FunctionalInterface
interface BuildLog{
    void save();
}