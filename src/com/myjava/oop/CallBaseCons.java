package com.myjava.oop;

/**
 * Created by zhouzilong on 2016/6/30.
 * about 子类调用父类构造器
 * #super调用的是其父类的构造器，必须出现在子类构造器执行体中的第一行,而this调用的是同一个类中重载的构造器，所以this调用和super调用不会同时出现。
 * #子类构造器调用父类构造器分如下几种情况：
 * tip:
 * 1.子类构造器执行体的第一行使用super显示调用父类构造器，系统将根据super调用里传入的实参列表调用父类对应的构造器。
 */
class Base {
    public double size;
    public String name;
    public Base(double size, String name){
        this.size = size;
        this.name = name;
    }
}
// 子类构造器调用父类构造器
public class CallBaseCons extends Base {
    public String color;

    public CallBaseCons(double size, String name, String color) {
//        通过super调用父类构造器完成初始化过程
        super(size, name);
        this.color = color;
    }
    public static void main(String [] args){
        CallBaseCons cbc = new CallBaseCons(5.6, "testObj", "red");
        System.out.println(cbc.size + cbc.name + cbc.color);
    }
}
