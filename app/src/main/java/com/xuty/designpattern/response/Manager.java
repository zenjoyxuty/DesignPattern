package com.xuty.designpattern.response;

public class Manager extends Leader{
    @Override
    protected void handle(int money) {
        System.out.println("经理批复报销======="+money+"元");

    }

    @Override
    protected int limit() {
        return 10000;
    }
}
