package com.xuty.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xuty.designpattern.adapter.Volt220;
import com.xuty.designpattern.adapter.classadapter.VolAdapter;
import com.xuty.designpattern.adapter.object.VoltAdapter;
import com.xuty.designpattern.bridge.Coffee;
import com.xuty.designpattern.bridge.LargeCoffee;
import com.xuty.designpattern.bridge.Ordinary;
import com.xuty.designpattern.bridge.SmallCoffee;
import com.xuty.designpattern.bridge.Sugar;
import com.xuty.designpattern.decorator.Boy;
import com.xuty.designpattern.decorator.CheapCloth;
import com.xuty.designpattern.decorator.ExpensiveCloth;
import com.xuty.designpattern.decorator.Person;
import com.xuty.designpattern.decorator.PersonCloth;
import com.xuty.designpattern.flyweight.Ticket;
import com.xuty.designpattern.flyweight.TicketFactory;
import com.xuty.designpattern.mediator.CDDevice;
import com.xuty.designpattern.mediator.CPU;
import com.xuty.designpattern.mediator.GraphicsCard;
import com.xuty.designpattern.mediator.MainBoard;
import com.xuty.designpattern.mediator.SoundCard;
import com.xuty.designpattern.proxy.dynamicproxy.DynamicProxy;
import com.xuty.designpattern.proxy.staticproxy.ILawsuit;
import com.xuty.designpattern.proxy.staticproxy.Lawyer;
import com.xuty.designpattern.proxy.staticproxy.XiaoMin;
import com.xuty.designpattern.template.AbstractComputer;
import com.xuty.designpattern.template.CoderComputer;
import com.xuty.designpattern.template.MilitaeryComputer;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设计模式之二十六，桥接模式
         //bridgeMode();

        //享元模式
        //flyweight();

        //装饰模式
        //decorator();

        //适配器模式

        //类

        //VolAdapter volAdapter = new VolAdapter();
       // System.out.println("类输出电压"+volAdapter.getVol5());

        //对象
        //VoltAdapter voltAdapter = new VoltAdapter(new Volt220());
        //System.out.println("对象输出电压"+voltAdapter.getVol5());

        //代理模式
        //staticProxy();
       // dynamicProxy();


        //中介者模式
        //mediator();

        //模板模式
        template();
    }

    private void template() {
        AbstractComputer computer = new CoderComputer();
        computer.startUp();
        computer = new MilitaeryComputer();
        computer.startUp();
    }

    private void mediator() {
        MainBoard mainBoard = new MainBoard();
        CDDevice  cdDevice = new CDDevice(mainBoard);
        CPU cpu = new CPU(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);
        GraphicsCard graphicsCard = new GraphicsCard(mainBoard);

        mainBoard.setCdDevice(cdDevice);
        mainBoard.setCpu(cpu);
        mainBoard.setSoundCard(soundCard);
        mainBoard.setGraphicsCard(graphicsCard);

        cdDevice.load();

    }

    private void dynamicProxy() {
        ILawsuit xiaomin = new XiaoMin();
        DynamicProxy proxy = new DynamicProxy(xiaomin);

        ClassLoader classLoader = xiaomin.getClass().getClassLoader();
        ILawsuit lawsuit = (ILawsuit) Proxy.newProxyInstance(classLoader,new Class[]{ILawsuit.class},proxy);
        lawsuit.submit();

        lawsuit.burden();

        lawsuit.defend();

        lawsuit.finish();
    }

    private void staticProxy() {
        ILawsuit xiaomin = new XiaoMin();

        ILawsuit lawsuit = new Lawyer(xiaomin);

        lawsuit.submit();

        lawsuit.burden();

        lawsuit.defend();

        lawsuit.finish();
    }

    private void decorator() {
        Person person = new Boy();
        PersonCloth clothExpensive= new ExpensiveCloth(person);
        clothExpensive.dressed();
        PersonCloth clothCheap = new CheapCloth(person);
        clothCheap.dressed();
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
