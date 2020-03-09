package com.xuty.designpattern.decorator;

public class Boy extends Person{

    @Override
    public void dressed() {
        System.out.println("穿了内衣内裤");
    }
}
