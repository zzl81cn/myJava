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
        // 实例化OutputFactory
        OutputFactory of = new OutputFactory();
        // 将OutputFactory实例的getOutput()传入Computer实例，得以将工厂里面希望使用的Output实现类实例传入。
        // 因为此时Computer与Printer或BetterPrinter已完全分离
        Computer c = new Computer(of.getOutput());
        c.keyIn("SSH");
        c.keyIn("Crazy Java");
        c.print();
    }
}
