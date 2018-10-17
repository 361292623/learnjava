package com.itheima._05Collections集合操作工具类;

import java.util.Objects;

/*
* 创建一个苹果类:
*
* */
public class Apple {
    private String brand ; // 品牌
    private String color ; // 颜色
    private double weight ; // 重量

    //Apple a1 = new Apple("红富士","红色",502.29);
    //Apple a2 = new Apple("红富士","红色",502.29);
    // 只要两个对象的 品牌  颜色 重量 一样 哈希值结果一定是相同的.
    @Override
    public int hashCode() {
        //a1 = Objects.hash("红富士", "红色", 502.29)
        //a2 = Objects.hash("红富士", "红色", 502.29)
        return Objects.hash(brand, color, weight);
    }

    // 只要两个对象的 品牌  颜色 重量 一样 结果一定是true.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Double.compare(apple.weight, weight) == 0 &&
                Objects.equals(brand, apple.brand) &&
                Objects.equals(color, apple.color);
    }


    public Apple() {
    }

    public Apple(String brand, String color, double weight) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}'+"\n";
    }
}
