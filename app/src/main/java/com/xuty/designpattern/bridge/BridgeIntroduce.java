package com.xuty.designpattern.bridge;

public class BridgeIntroduce {
    //将抽象部分与实现部分分离，使它们可以独立进行变化
    //连接抽象部分和实现部分（桥梁）
    //任何纬度的变化类或者多个树状类之间的耦合都可以用桥接模式来进行解耦


    //使用场景

    //抽象化角色和具体角色之间更多灵活性，避免在两个层次之间建立静态的连接
    //一个类存在两个不可以变化的维度，而且这两个维度都需要进行扩展
    //不论是coffee 变化了，还是CoffeeAdditives变化了，其相对于对方都是独立而言的
}