package com.xuty.designpattern.decorator;

public class ExpensiveCloth extends PersonCloth{

    public ExpensiveCloth(Person person) {
        super(person);
    }

    public void dressShirt(){
        System.out.println("穿短袖");
    }

    public void dressLeather(){
        System.out.println("穿件皮衣");
    }

    public void dressJean(){
        System.out.println("穿牛仔裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
