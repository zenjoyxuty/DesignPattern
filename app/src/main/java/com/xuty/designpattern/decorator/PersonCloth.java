package com.xuty.designpattern.decorator;

import java.net.PortUnreachableException;

public class PersonCloth extends Person{

    protected Person person;

    public PersonCloth(Person person){

        this.person = person;
    }

    @Override
    public void dressed() {

        person.dressed();
    }
}
