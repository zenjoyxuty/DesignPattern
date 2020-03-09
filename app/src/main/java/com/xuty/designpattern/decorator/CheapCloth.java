package com.xuty.designpattern.decorator;

public class CheapCloth extends PersonCloth{
    public CheapCloth(Person person) {
        super(person);
    }

    public void  dressShorts(){
        System.out.println("穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
