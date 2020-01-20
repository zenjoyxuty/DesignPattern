package com.xuty.designpattern.singleton;

public class CommonNotice {
    /*
     杜绝单例对象在被反序列化的时候重新生成对象，需在单例类中加入一下方法，枚举方式除外

     private Object readResolve() throws ObjectStreamException{
         return ourInstance;
       }
    * */
}
