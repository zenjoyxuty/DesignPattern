package com.xuty.designpattern.proxy.staticproxy;

import java.util.PropertyResourceBundle;

public class Lawyer implements ILawsuit{

    private ILawsuit mLawsuit;


    public Lawyer(ILawsuit lawsuit){
        mLawsuit = lawsuit;
    }


    @Override
    public void submit() {
        mLawsuit.submit();

    }

    @Override
    public void burden() {

        mLawsuit.burden();
    }

    @Override
    public void defend() {

        mLawsuit.defend();
    }

    @Override
    public void finish() {

        mLawsuit.finish();
    }
}
