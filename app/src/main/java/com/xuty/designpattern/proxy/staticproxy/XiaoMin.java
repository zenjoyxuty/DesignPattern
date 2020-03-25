package com.xuty.designpattern.proxy.staticproxy;

public class XiaoMin implements ILawsuit{
    @Override
    public void submit() {
        System.out.println("老板拖欠工资，特申请仲裁");
    }

    @Override
    public void burden() {

        System.out.println("这是合同书和过去一年的银行工资流水");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿");

    }

    @Override
    public void finish() {
        System.out.println("诉讼成功");

    }
}
