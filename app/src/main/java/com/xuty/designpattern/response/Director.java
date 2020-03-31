package com.xuty.designpattern.response;

public class Director extends Leader {
    @Override
    protected void handle(int money) {
        System.out.println("主管批复报销======="+money+"元");

    }

    @Override
    protected int limit() {
        return 5000;
    }
}
