package com.xuty.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xuty.designpattern.bridge.Coffee;
import com.xuty.designpattern.bridge.LargeCoffee;
import com.xuty.designpattern.bridge.Ordinary;
import com.xuty.designpattern.bridge.SmallCoffee;
import com.xuty.designpattern.bridge.Sugar;
import com.xuty.designpattern.flyweight.Ticket;
import com.xuty.designpattern.flyweight.TicketFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设计模式之二十六，桥接模式
         //bridgeMode();

        //享元模式
        flyweight();
    }

    private void bridgeMode() {
        Ordinary ordinary = new Ordinary();
        Sugar sugar  = new Sugar();
        LargeCoffee largeCoffee = new LargeCoffee(ordinary);
        largeCoffee.makeCoffee();
        SmallCoffee  smallCoffee = new SmallCoffee(sugar);
        smallCoffee.makeCoffee();
    }

    private void flyweight(){
        Ticket ticket01 = TicketFactory.getTicket("青岛","北京");
        ticket01.showTicketInfo("上铺");
        Ticket ticket02 = TicketFactory.getTicket("青岛","北京");
        ticket02.showTicketInfo("下铺");
        Ticket ticket03 = TicketFactory.getTicket("青岛","北京");
        ticket03.showTicketInfo("坐铺");
    }
}
