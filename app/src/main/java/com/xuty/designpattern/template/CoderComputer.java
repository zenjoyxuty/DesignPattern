package com.xuty.designpattern.template;

public class CoderComputer extends AbstractComputer {

    @Override
    protected void login() {
        System.out.println("程序员输入用户名和密码进行验证");
    }
}
