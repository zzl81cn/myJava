package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/4.
 */
public class OutputFactory {
    // 该方法返回一个Output实现类的实例，具体创建哪一个实现类的对象由该方法决定。
    public Output getOutput(){
//        return new Printer();
        return new BetterPrinter();
    }

    public static void main(String[] args) {
        OutputFactory of = new OutputFactory();
        Computer c = new Computer(of.getOutput());
        c.keyIn("SSH");
        c.keyIn("Crazy Java");
        c.print();
    }
}
