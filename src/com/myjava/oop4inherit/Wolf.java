package com.myjava.oop4inherit;

/**
 * Created by zhouzilong on 2016/6/30.
 * about 三个类之间严格的继承关系
 * tip：
 * 2.子类构造器执行体的第一行代码使用this显示调用本类中重载的构造器，系统将根据this调用里传入的实参列表调用本类中的另一个构造器。执行本类中另一个构造器是即会调用父类的构造器。
 * 3.子类构造器执行体中既没有super调用，也没有this调用，系统将会在执行子类构造器之前隐式调用父类无参数的构造器。
 */
class Creature{
    public Creature() {
        System.out.println("Creature 无参数的构造器");
    }

}

class Animal extends Creature {
    public Animal(String name) {
        System.out.println("Animal 带一个参数的构造器，" + "该动物的 name为 " + name);
    }

    public Animal(String name, int age) {
//        使用this调用同一个重载的构造器
        this(name);
        System.out.println("Animal 带两个参数的构造器，" + "其age为 " + age);
    }
}

public class Wolf extends Animal {

    public Wolf(){
//        显示调用父类有两个参数的构造器
        super("gray wolf", 3);
        System.out.println("wolf无参数构造器");
    }
    public static void main(String[] args) {
        new Wolf();
    }
}
