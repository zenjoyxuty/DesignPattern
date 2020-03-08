package com.xuty.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
//内部状态为from,to，外部状态为price，bunk

public class TicketFactory {


    public static Map<String ,Ticket> sTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from,String to){
        String  key = from+"-"+to;
        if(sTicketMap.get(key)!=null){
            System.out.println("使用缓存====="+key);
            return sTicketMap.get(key);
        }else {
            System.out.println("创建对象====="+key);
            Ticket ticket = new TrainTicket(from,to);
            sTicketMap.put(key,ticket);
            return  ticket;

        }

    }
}
