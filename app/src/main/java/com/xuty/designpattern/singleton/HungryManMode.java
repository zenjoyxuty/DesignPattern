package com.xuty.designpattern.singleton;

//饿汉模式
//1.如何确保多线程下一个对象
//2.如何确保反序列化时不会重新构建对象


public class HungryManMode {

    //1.构造函数私有化
    private HungryManMode(){}

    //2.单例对象在声明的时候已经初始化
    private static HungryManMode hungryManMode = new HungryManMode();

    //3.通过公有的静态方法返回对象

    public static  HungryManMode getInstance(){

        return  hungryManMode;
    }


}
