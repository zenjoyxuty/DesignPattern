package com.xuty.designpattern.singleton;

//双重加锁校验模式
//1.如何确保多线程下一个对象=====>同步对象，减少不必要的同步开销
//2.如何确保反序列化时不会重新构建对象

public class DoubleCheckMode {


    //1.私有化构造器
    private DoubleCheckMode() {

    }

    //单例对象

    //volatile保证原子性，如何保证？？？
    /*
    https://blog.csdn.net/u010255818/article/details/65633033
    保证了每次读写变量都从主内存中读
    1.给 singleton 分配内存
    2.调用 Singleton 的构造函数来初始化成员变量，形成实例
    3.将singleton对象指向分配的内存空间（执行完这步 singleton才是非 null 了）
    但是在 JVM 的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是
    不能保证的，最终的执行顺序可能是 1-2-3 也可能是 1-3-2。如果是后者，则在 3 执行完毕、
    2 未执行之前，被线程二抢占了，这时 instance 已经是非 null 了（但却没有初始化），
    所以线程二会直接返回 instance，然后使用，然后顺理成章地报错
    volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，
    对它的写操作就会有一个内存屏障（什么是内存屏障？），这样，在它的赋值完成之前，就不用会调用读操作。
    * */

    private static volatile DoubleCheckMode doubleCheckMode;


    //静态方法得到单例对象
  /*  如果没有外层的check，相当于给整个getInstance()方法加上了synchronized关键字，
       也就是每次获取单例对象都要获取class对象的monitor，monitor是粒度较大的的锁，开销较大
      。所以外层的判断目的是：第一次获取单例对象后，再次获取该单例对象无需进行同步
    如果没有内层的check，假如有两个线程，线程1和线程2同时进入外层判断，即第8步，线程1获得对象锁，
    进入同步代码块并初始化对象后，释放对象锁，返回单例对象结束了，线程1获取对象锁进入同步代码块后又
    再次初始化了instance对象，导致多线程下单例模式的非线程安全；*/
    public static DoubleCheckMode getInstance() {
        if (doubleCheckMode == null) {
            synchronized (DoubleCheckMode.class) {
                if (doubleCheckMode == null) {
                    doubleCheckMode = new DoubleCheckMode();
                }
            }
        }
        return doubleCheckMode;
    }
}
