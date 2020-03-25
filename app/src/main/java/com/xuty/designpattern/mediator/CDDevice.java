package com.xuty.designpattern.mediator;

public class CDDevice  extends Colleague{

    public String data;
    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String read(){
        return  data;
    }

    public void load(){
        data = "视频数据,音频数据";
        mediator.changed(this);
    }
}
