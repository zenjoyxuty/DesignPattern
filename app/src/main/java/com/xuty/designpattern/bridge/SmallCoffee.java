package com.xuty.designpattern.bridge;

public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的"+impl.doSomething()+"coffee");

    }
}
