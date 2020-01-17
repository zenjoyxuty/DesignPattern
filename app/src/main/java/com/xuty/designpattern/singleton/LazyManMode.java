package com.xuty.designpattern.singleton;

//懒汉模式
//1.如何确保多线程下一个对象=====>同步方法
//2.如何确保反序列化时不会重新构建对象

//缺点：每次调用的时候都会造成不必要的同步开销

public class LazyManMode {

    //1.私有化构造器
    private LazyManMode(){}

    //2.创建单例对象

    private static LazyManMode lazyManMode;

    //3.通过静态方法返回单例对象,需要时创建
    private synchronized static LazyManMode getInstance(){
        if(lazyManMode == null){
            return  new LazyManMode();
        }
        return lazyManMode;
    }

}
