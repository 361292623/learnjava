package com.itheima.作业.训练7;

public class Test7 {
    public static void main(String[] args){
        Car q7 = getCar(new BeanFactory<Car>() {
            @Override
            public Car getBean() {
                return new Car();
            }
        });
        q7.setBrand("奥迪");
    }
    public static Car getCar(BeanFactory<Car> factory){
        return factory.getBean();
    }
}


@FunctionalInterface
 interface BeanFactory<T>{
    T getBean();
}

 class Car {
    // 品牌
    private String brand;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Car(String brand) {
        this.brand = brand;
    }
     public Car() {
     }
 }