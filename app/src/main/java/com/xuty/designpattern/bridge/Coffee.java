package com.xuty.designpattern.bridge;

public abstract class Coffee {

    protected CoffeeAdditives impl;


    public Coffee(CoffeeAdditives impl){
        this.impl = impl;
    }


    public abstract  void makeCoffee();
}
