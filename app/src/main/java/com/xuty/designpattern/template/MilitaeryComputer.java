package com.xuty.designpattern.template;

public class MilitaeryComputer  extends AbstractComputer{

    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查防火墙");
    }

    @Override
    protected void login() {
        System.out.println("进行指纹识别验证");

    }
}
