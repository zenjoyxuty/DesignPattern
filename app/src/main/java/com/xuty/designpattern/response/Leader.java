package com.xuty.designpattern.response;

public abstract class Leader {
    public Leader  nextHandler;

    public final  void handleRequest(int money){
        if(money <= limit()){
            handle(money);
        }else {
            if(null != nextHandler){
                nextHandler.handleRequest(money);
            }
        }
    }

    protected abstract void handle(int money);

    protected abstract int limit();

}
