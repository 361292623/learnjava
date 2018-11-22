package com.itheima.url编码;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author pkxing
 * @version 1.0
 * @Package com.itheima.url编码
 * @date 2018/11/20  下午12:12
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        // 字符串
        String str = "美女";
        // 对字符串进行URL编码
        String encode = URLEncoder.encode(str, "utf-8");
        System.out.println(encode);

        // 对编码的字符串解码
        String decode = URLDecoder.decode(encode, "utf-8");
        System.out.println(decode);

    }
}
