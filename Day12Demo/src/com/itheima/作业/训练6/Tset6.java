package com.itheima.作业.训练6;

public class Tset6 {
    public static void main(String[] args) {
        Book book = new Book("新华字典", "商务印书馆");
        book.sale();
    }


}

interface StringWrapper {
    String wrap(String str);
}

class Book {
    // 书名
    private String name;
    // 出版社
    private String publishCompany;

    public Book(String name, String publishCompany) {
        this.name = name;
        this.publishCompany = publishCompany;
    }

    // 拼接带书名号的书名•
    private String bookMsg(String bookname) {
        return "《" + bookname + "》";
    }

    // 拼接出版信息
    private String publishMsg(String msg) {
        return "【专柜正品<" + msg + ">原装绝版】";
    }

    // 使用StringWrapper为上架销售信息包装•
    public String packSaleMsg(String msg, StringWrapper wrapper) {
        return wrapper.wrap(msg);

    }

    // 上架销售
    public void sale() {
// 开始包装上架销售信息
        String saleMsg = packSaleMsg(bookMsg(name), this::bookMsg) +
                packSaleMsg(publishMsg(publishCompany), this::publishMsg);
        System.out.println(saleMsg);
// 开始售卖
        System.out.println("2元一本，欲练此功，必先购买！");
    }
}