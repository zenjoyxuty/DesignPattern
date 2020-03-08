package com.xuty.designpattern.bridge;

public class Ordinary extends CoffeeAdditives {
    @Override
    public String doSomething() {
        return "原味";
    }
}
